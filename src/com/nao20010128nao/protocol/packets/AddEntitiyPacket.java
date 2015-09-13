package com.nao20010128nao.protocol.packets;

import net.minecraft.server.v1_8_R3.NBTBase;

public class AddEntitiyPacket extends DataPacket {
	public int eid, type, x, y, z, speedX, speedY, speedZ;
	public double yaw, pitch;
	public NBTBase metadata;

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

	}

}
