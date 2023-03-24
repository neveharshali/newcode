package com.testpackage;

public class Constructor_concept {
	
	String name;
	int id;
	public Constructor_concept() {//no-arg constructor
         
         name="Harshali";
          id=101;
	}
	public Constructor_concept(String name,int id) {//parameterized constructor
		this.name=name;
		this.id=id;
		
	}
	
	public static void main(String[] args) {
		Constructor_concept concept = new Constructor_concept();
		System.out.println(concept.name);
		System.out.println(concept.id);
		Constructor_concept c= new Constructor_concept("chaitali",102);
		System.out.println(c.name);
		System.out.println(c.id);
	}

}
