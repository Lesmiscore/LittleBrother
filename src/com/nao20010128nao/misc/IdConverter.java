package com.nao20010128nao.misc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public final class IdConverter {
	static Map<String, Integer> pcToPe = new HashMap<>();
	static Map<Integer, String> peToPc = new HashMap<>();
	static {
		try {
			InputStream is = IdConverter.class
					.getResourceAsStream("blocks.txt");
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			String line;
			while (null != (line = br.readLine())) {
				if (line.startsWith("#")) {
					continue;
				}
			}
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}

	private IdConverter() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

}
