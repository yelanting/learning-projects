package com.projects.learning.jvm.mainprogram;

public class MyJVMTestWithSwitchCase {
	int chooseNear(int i) {
		switch (i) {
			case 100:
				return 0;
			case 101:
				return 1;
			case 104:
				return 4;
			default:
				return -1;
		}
	}

	int chooseFar(int i) {
		switch (i) {
			case 1:
				return 1;
			case 10:
				return 10;
			case 100:
				return 100;
			default:
				return -1;
		}
	}

	String chooseString(String sex) {
		switch (sex) {
			case "man":
				return "man";
			case "woman":
				return "woman";
			default:
				return "nosex";
		}
	}
}