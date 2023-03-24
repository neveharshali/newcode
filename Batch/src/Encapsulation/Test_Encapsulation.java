package Encapsulation;

public class Test_Encapsulation {
	//1.declare the variable as a private
	//2.provide public getter and setter-->modify and view
	private String name="harshu"; //data hidding
     
	private int id;
	public String getName() { //return
		return name;
	}

	public void setName(String name) {
		this.name = name;
		//this--cureent class instance variable
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
