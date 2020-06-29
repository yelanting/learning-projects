package com.projects.learning.jvm.mainprogram;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class InitTestDemoWithException {
	private FileOutputStream outputStream = new FileOutputStream("test.txt");

	public InitTestDemoWithException() throws FileNotFoundException {

	}
}