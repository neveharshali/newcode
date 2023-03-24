package Abstraction;

public class child extends Test_1 {

	public static void main(String[] args) {
		child c= new child();
		c.Display();
		c.demo();

	}

	@Override
	public void Display() {
		System.out.println("Display");
		
	}
   public void demo() {
	   System.out.println("Demo_Child");
   }
}
