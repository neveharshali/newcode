package Abstraction;

public class Childinterface  implements I1,I2 {

	public static void main(String[] args) {
		Childinterface ci=new Childinterface();
		ci.show();
		ci.run();
		System.out.println(ci.a);

	}

	@Override
	public void show() {
	System.out.println("show");
		
	}

	@Override
	public void run() {
		System.out.println("run");
		
	}

}
