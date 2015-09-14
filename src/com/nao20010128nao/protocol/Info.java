package com.nao20010128nao.protocol;

public interface Info {
	/**
	 * Actual Minecraft: PE protocol version
	 */
	public static final int CURRENT_PROTOCOL = 27;
	public static final int LOGIN_PACKET = 0x82;
	public static final int PLAY_STATUS_PACKET = 0x83;
	public static final int DISCONNECT_PACKET = 0x84;
	public static final int TEXT_PACKET = 0x85;
	public static final int SET_TIME_PACKET = 0x86;
	public static final int START_GAME_PACKET = 0x87;
	public static final int ADD_PLAYER_PACKET = 0x88;
	public static final int REMOVE_PLAYER_PACKET = 0x89;
	public static final int ADD_ENTITY_PACKET = 0x8a;
	public static final int REMOVE_ENTITY_PACKET = 0x8b;
	public static final int ADD_ITEM_ENTITY_PACKET = 0x8c;
	public static final int TAKE_ITEM_ENTITY_PACKET = 0x8d;
	public static final int MOVE_ENTITY_PACKET = 0x8e;
	public static final int MOVE_PLAYER_PACKET = 0x8f;
	public static final int REMOVE_BLOCK_PACKET = 0x90;
	public static final int UPDATE_BLOCK_PACKET = 0x91;
	public static final int ADD_PAINTING_PACKET = 0x92;
	public static final int EXPLODE_PACKET = 0x93;
	public static final int LEVEL_EVENT_PACKET = 0x94;
	public static final int TILE_EVENT_PACKET = 0x95;
	public static final int ENTITY_EVENT_PACKET = 0x96;
	public static final int MOB_EFFECT_PACKET = 0x97;
	public static final int PLAYER_EQUIPMENT_PACKET = 0x98;
	public static final int PLAYER_ARMOR_EQUIPMENT_PACKET = 0x99;
	public static final int INTERACT_PACKET = 0x9a;
	public static final int USE_ITEM_PACKET = 0x9b;
	public static final int PLAYER_ACTION_PACKET = 0x9c;
	public static final int HURT_ARMOR_PACKET = 0x9d;
	public static final int SET_ENTITY_DATA_PACKET = 0x9e;
	public static final int SET_ENTITY_MOTION_PACKET = 0x9f;
	public static final int SET_ENTITY_LINK_PACKET = 0xa0;
	public static final int SET_HEALTH_PACKET = 0xa1;
	public static final int SET_SPAWN_POSITION_PACKET = 0xa2;
	public static final int ANIMATE_PACKET = 0xa3;
	public static final int RESPAWN_PACKET = 0xa4;
	public static final int DROP_ITEM_PACKET = 0xa5;
	public static final int CONTAINER_OPEN_PACKET = 0xa6;
	public static final int CONTAINER_CLOSE_PACKET = 0xa7;
	public static final int CONTAINER_SET_SLOT_PACKET = 0xa8;
	public static final int CONTAINER_SET_DATA_PACKET = 0xa9;
	public static final int CONTAINER_SET_CONTENT_PACKET = 0xaa;
	// public static final int CONTAINER_ACK_PACKET = 0xab;
	public static final int ADVENTURE_SETTINGS_PACKET = 0xac;
	public static final int TILE_ENTITY_DATA_PACKET = 0xad;
	// public static final int PLAYER_INPUT_PACKET = 0xae;
	public static final int FULL_CHUNK_DATA_PACKET = 0xaf;
	public static final int SET_DIFFICULTY_PACKET = 0xb0;
	public static final int BATCH_PACKET = 0xb1;
}