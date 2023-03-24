
public class Test {

	public static void main(String[] args) {
		try {
			Test t =new Test();
			t.method1();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally{
			System.out.println("finally");
		}
	}
		public void method1() {
			throw new RuntimeException();
		}
	

}
