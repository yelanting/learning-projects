package com.projects.learning.jvm.mainprogram;

public class InitTestDemoCommon {
    private static int aInt = 0;

	private int a = 10;

	public InitTestDemoCommon() {
		int c = 30;
	}

	{
		int b = 20;
    }
    
    static {
        int bInt = 20;
    }
    
    public void testMethodWithNew(){
        InitTestDemoCommon initTestDemoCommon = new InitTestDemoCommon();
    }
}