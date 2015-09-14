package com.nao20010128nao.protocol.packets;

import java.util.HashSet;
import java.util.Set;

import net.minecraft.server.v1_8_R3.NBTTagCompound;

import com.nao20010128nao.misc.tuples.Tuple3;
import com.nao20010128nao.protocol.Info;

/**
 * Based on: {@link https
 * ://github.com/PocketMine/PocketMine-MP/blob/master/src/pocketmine
 * /network/protocol/AddEntityPacket.php}
 * */
public class AddEntitiyPacket extends DataPacket {
	public static final int NETWORK_ID = Info.ADD_ENTITY_PACKET;

	public int type;
	public double x, y, z, yaw, pitch, speedX, speedY, speedZ;
	public long eid;
	public NBTTagCompound metadata;
	public Set<Tuple3<Long, Long, Byte>> links = new HashSet<>();

	public AddEntitiyPacket() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public void encode() {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void decode() {
		// TODO 自動生成されたメソッド・スタブ
		reset();
		putLong(eid);
		putInt(type);
		putFloat((float) x);
		putFloat((float) y);
		putFloat((float) z);
		putFloat((float) speedX);
		putFloat((float) speedY);
		putFloat((float) speedZ);
		putFloat((float) yaw);
		putFloat((float) pitch);
		putMetadata(metadata);
		putShort((short) links.size());
		for (Tuple3<Long, Long, Byte> link : links) {
			putLong(link.getA());
			putLong(link.getB());
			putByte(link.getC());
		}
	}
}
