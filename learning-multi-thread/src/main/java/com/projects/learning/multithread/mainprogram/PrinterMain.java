/**
 * @author : 孙留平
 * @since : 2020年5月6日 下午5:50:19
 * @see:
 */
package com.projects.learning.multithread.mainprogram;

import com.projects.learning.multithread.runnables.Printer;

/**
 * @author : Administrator
 * @since : 2020年5月6日 下午5:50:19
 * @see :
 */
public class PrinterMain {
	public static void main(String[] args) {
		new Thread(new Printer("GOOD!")).start();
		new Thread(new Printer("Nice!")).start();

		Runnable runnable1 = new Printer("BEST");
		Thread thread = new Thread(runnable1);

		thread.start();
	}
}
