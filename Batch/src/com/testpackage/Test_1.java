package com.testpackage;

public class Test_1 {
	
	int a=10;//non_static variable==>instance-->declare inside the class but outside the method
	static int b=20; //static variable/class variable-->
	
	public void run() {
		System.out.println("Hello Bugspatter");
	}
	public static void display() {
		
			System.out.println("Automation Test");
	}
	
	public static void main(String[] args) {
		int c=30; //local variable==>declare inside main method
		System.out.println(c);
		System.out.println(Test_1.b);//static
		Test_1 xyz= new Test_1();//object
		System.out.println(xyz.a);//non_static
          xyz.run();
          Test_1.display();
	}

}
