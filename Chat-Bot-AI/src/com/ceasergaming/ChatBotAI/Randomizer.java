package com.ceasergaming.ChatBotAI;

import java.util.Random;

public class Randomizer {

	public static String randomize(String[] s) {
		Random random = new Random();
		int index = random.nextInt(s.length);
		return s[index];
	}
}
