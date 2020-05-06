/**
 * @author : 孙留平
 * @since : 2020年5月6日 下午5:23:13
 * @see:
 */
package com.projects.learning.multithread.mainprogram;

import com.projects.learning.multithread.threads.MyThread;

/**
 * @author : Administrator
 * @since : 2020年5月6日 下午5:23:13
 * @see :
 */
public class MyThreadMain {

	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		myThread.start();

		for (int i = 0; i < 10000; i++) {
			System.out.println("good" + i);
		}
	}

}
