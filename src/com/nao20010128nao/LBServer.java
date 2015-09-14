package com.nao20010128nao;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

import org.bukkit.Server;

import com.nao20010128nao.misc.tuples.Tuple2;

public class LBServer implements Runnable {
	DatagramSocket socket = null;

	public LBServer(Server server, LittleBrother lb)
			throws NumberFormatException, SocketException {
		// TODO 自動生成されたコンストラクター・スタブ
		server.getScheduler().scheduleSyncDelayedTask(lb, this, 2);
		socket = new DatagramSocket(Integer.parseInt(lb.config
				.get("server-port")));
	}

	@Override
	public void run() {
		// TODO 自動生成されたメソッド・スタブ
		new Thread() {
			@Override
			public void run() {
				try {
					while (true) {
						Tuple2<DatagramPacket, byte[]> t = makePacket();
						DatagramPacket packet = t.getA();
						socket.receive(packet);
					}
				} catch (IOException e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
				}
			}
		}.start();
	}

	public Tuple2<DatagramPacket, byte[]> makePacket() {
		byte[] buf = new byte[1024];
		DatagramPacket packet = new DatagramPacket(buf, buf.length);
		return new Tuple2<DatagramPacket, byte[]>(packet, buf);
	}
}
