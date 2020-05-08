/**
 * @author : 孙留平
 * @since : 2020年5月6日 下午6:19:12
 * @see:
 */
package com.projects.learning.multithread.mainprogram;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

import com.projects.learning.multithread.runnables.Printer;

/**
 * @author : Administrator
 * @since : 2020年5月6日 下午6:19:12
 * @see :
 */
public class MyThreadFactoryMain {

	public static void main(String[] args) {
		ThreadFactory threadFactory = Executors.defaultThreadFactory();

		threadFactory.newThread(new Printer("BEST!")).start();

		for (int i = 0; i < 10000; i++) {
			System.out.println("GOOD!");
		}
	}
}
