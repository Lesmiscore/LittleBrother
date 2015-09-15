package com.nao20010128nao.protocol.packets;

import net.minecraft.server.v1_8_R3.ItemStack;

import com.nao20010128nao.misc.PEPacketIDs;

/**
 * Based on: {@link https
 * ://github.com/PocketMine/PocketMine-MP/blob/master/src/pocketmine
 * /network/protocol/AddItemEntityPacket.php}
 * */
public class AddItemEntityPacket extends DataPacket {
	public static final int NETWORK_ID = PEPacketIDs.ADD_ITEM_ENTITY_PACKET;

	public ItemStack item;
	public double x, y, z, speedX, speedY, speedZ;
	public long eid;

	public AddItemEntityPacket() {
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
		// putSlot(item); //define it later
		putFloat((float) x);
		putFloat((float) y);
		putFloat((float) z);
		putFloat((float) speedX);
		putFloat((float) speedY);
		putFloat((float) speedZ);
	}
}
