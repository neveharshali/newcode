package com.testpackage;

public class AccessModifire {
	//non_static-->
	public int a=10;//access-within class
	protected int b=20;
	private int c=30;
	 int d=40;

	public static void main(String[] args) {
		AccessModifire am=new AccessModifire();
		System.out.println(am.a);
		System.out.println(am.b);
		System.out.println(am.c);
		
		TestDemo test=new TestDemo();
		System.out.println(test.p);
		System.out.println(test.q);
		//System.out.println(test.r);
		System.out.println(test.s);
		
		

	}
}
class TestDemo{
	public int p=1;
	protected int q=2;
	private int r=3;
	int s=4;
}


