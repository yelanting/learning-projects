/**
 * @author : 孙留平
 * @since : 2020年5月27日 上午12:34:30
 * @see:
 */
package com.projects.learning.multithread.singlethreadedexecution;

/**
 * @author : Administrator
 * @since : 2020年5月27日 上午12:34:30
 * @see :
 */
public class UserThread extends Thread {
	private final Gate gate;

	private final String myname;

	private final String myaddress;

	/**
	 * @see :
	 */
	public UserThread(Gate gate, String myname, String myaddress) {
		this.gate = gate;
		this.myname = myname;
		this.myaddress = myaddress;

	}

	public void run() {
		System.out.println(myname + " begin!!!");

		while (true) {
			gate.pass(myname, myaddress);
		}
	}

}
