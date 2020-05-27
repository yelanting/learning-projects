/**
 * @author : 孙留平
 * @since : 2020年5月27日 上午12:34:10
 * @see: 创建一个门，让三个人不断通过 1. 首先创建一个门，传递给UserThread类的构造，告诉他们请通过这个门 2. 三个人分别为:
 *       Alice-America Bobby-Brazil Chris-Canada
 * 
 *       主线程会创建三个UserThread的实例，启动线程
 */
package com.projects.learning.multithread.singlethreadedexecution;

/**
 * @author : Administrator
 * @since : 2020年5月27日 上午12:34:10
 * @see :
 */
public class MyMainSafe {

	public static void main(String[] args) {
		System.out.println("Testing gate: ctrl + c to exit!");
		Gate gate = new Gate();
		new UserThread(gate, "Alice", "America").start();
		new UserThread(gate, "Bobby", "Brazil").start();
		new UserThread(gate, "Chris", "Canada").start();
	}

}
