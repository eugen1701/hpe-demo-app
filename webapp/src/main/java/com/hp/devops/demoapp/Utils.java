package com.hp.devops.demoapp;

import java.util.ArrayList;

public class Utils {

	static String[] nodify(String input) {
		ArrayList<String> nodes = new ArrayList<String>();
		System.out.println("touching the  failed test");
		if (input != null) {
			for (String node : input.split("/")) {
				if (node.compareTo("") != 0 && node.compareTo("api") != 0) {
					System.out.println(input);
					nodes.add(node);
					System.out.println("updated   to fail test sdf  ");
				}
			}
		}
		return nodes.toArray(new String[nodes.size()]);
	}

	static boolean simpleLogical() {
		System.out.println("lsdkjfl");
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			System.out.println("lsdkjfl");
		}

		return true;
	}
}
