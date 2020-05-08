/**
 * @author : 孙留平
 * @since : 2020年5月6日 下午5:21:43
 * @see:
 */
package com.projects.learning.multithread.threads;

/**
 * @author : Administrator
 * @since : 2020年5月6日 下午5:21:43
 * @see :
 */
public class MyThread extends Thread {
	public void run() {
		for (int i = 0; i < 10000; i++) {
			System.out.println("Nice" + i);
		}
	}
}
