package com.ceasergaming.ChatBotAI;

import java.util.Scanner;

public class Main {

	public static void main(String a[]) {
		try {
			while (true) {
				try {
					@SuppressWarnings("resource")
					String in = new Scanner(System.in).nextLine();
					Parses.parse(in.split(" "));
				} catch (Exception e) {	
				}
			Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
		}
	}
	
	public static void send(String s) {
		System.out.println(s);
	}
}
