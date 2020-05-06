/**
 * @author : 孙留平
 * @since : 2020年5月6日 下午5:47:48
 * @see:
 */
package com.projects.learning.multithread.runnables;

/**
 * @author : Administrator
 * @since : 2020年5月6日 下午5:47:48
 * @see :
 */
public class Printer implements Runnable {
	private String message;

	public Printer(String message) {
		this.message = message;
	}

	/**
	 * @see :
	 */
	public Printer() {
		this("defaultMessage");
	}

	@Override
	public void run() {
		for (int i = 0; i < 10000; i++) {
			System.out.println(message);
		}
	}

}
