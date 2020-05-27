/**
 * @author : 孙留平
 * @since : 2020年5月27日 上午12:34:21
 * @see:
 */
package com.projects.learning.multithread.singlethreadedexecution;

/**
 * @author : Administrator
 * @since : 2020年5月27日 上午12:34:21
 * @see : 表示通过的门，线程安全,在pass和toString行加锁
 */
public class SafeGate {
	/**
	 * 到目前为止已经通过的人数
	 */
	private int counter;

	/**
	 * 最后通过的人
	 */
	private String name;

	/**
	 * 出生地
	 */
	private String address;

	/**
	 * @see :
	 */
	public SafeGate() {
	}

	/**
	 * 通过门
	 * 
	 * @see :会把counter字段递增；传入的name和address赋值给人
	 * @param :
	 * @return : void
	 */
	public synchronized void pass(String name, String address) {
		this.counter++;
		this.name = name;
		this.address = address;
		check();
	}

	@Override
	public synchronized String toString() {
		return "No. " + counter + ": name->" + name + ",address->" + address;
	}

	/**
	 * 检查门的状态，检查最后一个通过人的数据。如果姓名和出生地不同，则表示异常
	 * 
	 * @see :
	 * @param :
	 * @return : void
	 */
	private void check() {
		if (name.charAt(0) != address.charAt(0)) {
			System.out.println("规则被打破了：" + toString());
		}
	}

}
