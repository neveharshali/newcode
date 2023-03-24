package com.testpackage;

public class Test_concept {
	String name;//instance variable
	int id;//instance variable
	public Test_concept() {
		name="bug";
		id=101;
	}
	public Test_concept(String name1,int id1) {
		name=name1;
		id=id1;
	}

	public static void main(String[] args) {
		Test_concept a= new Test_concept();
		//default constructor(without initialization compiled)
		//no-arg constructor
		System.out.println(a.name);//null //bug
		System.out.println(a.id);
		//parameterized constructor
		Test_concept b= new Test_concept("Harshali",102);
		System.out.println(b.name);
		System.out.println(b.id);

	}

}
