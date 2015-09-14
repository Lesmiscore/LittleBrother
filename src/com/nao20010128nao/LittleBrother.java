package com.nao20010128nao;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.java.JavaPluginLoader;

public class LittleBrother extends JavaPlugin {
	Map<String, String> config = new HashMap<String, String>();

	public LittleBrother() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public LittleBrother(JavaPluginLoader loader,
			PluginDescriptionFile description, File dataFolder, File file) {
		super(loader, description, dataFolder, file);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public void onEnable() {
		// TODO 自動生成されたメソッド・スタブ
		new LBServer(getServer(), this);
	}

	@Override
	public void onDisable() {
		// TODO 自動生成されたメソッド・スタブ

	}
}
