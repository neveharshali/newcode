package Test_1;

public class Parent_1 {
	public void m3() {
		System.out.println("Parent_1");
	}

}
class child_1 extends Parent_1{
	//m1,m3
	public void m1() {
		System.out.println("child_1");
	}
}
class child_2 extends child_1{
	//m2
	//m1,m2
	public void m2() {
		System.out.println("child_2");
	}
	
}
