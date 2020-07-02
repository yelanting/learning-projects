/**
 * @author : 孙留平
 * @since : 2020年6月30日 上午12:40:31
 * @see:
 */
package com.projects.learning.jvm.invokemethod;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

/**
 * @author : Administrator
 * @since : 2020年6月30日 上午12:40:31
 * @see :
 */
public class InvokeDemoTests {
	public void print(String s) {
		System.out.println("hello , " + s);
	}

	public static void main(String[] args) throws Throwable {

		InvokeDemoTests invokeDemoTests = new InvokeDemoTests();

		MethodType methodType = MethodType.methodType(void.class, String.class);

		MethodHandle methodHandle = MethodHandles.lookup()
		        .findVirtual(InvokeDemoTests.class, "print", methodType);

		methodHandle.invokeExact(invokeDemoTests, "world");
	}
}
