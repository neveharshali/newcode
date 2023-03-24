package Polymorphism;

public class MethodOverloading {
    //same class
	//name of method is same
	//argumeny diff-->
	
	public void test(String name,int a) {
		System.out.println("test");
	}
	public void test(int a,String name) {
		System.out.println("test_one argument");
	}
	public static void main(String[] args) {
		MethodOverloading load= new MethodOverloading();
		load.test("bug",10);
		load.test(10,"harshu");

	}

}
