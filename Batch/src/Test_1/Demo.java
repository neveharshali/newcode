package Test_1;

public class Demo {

	public static void main(String[] args) {
		/*child_2 c= new child_2();
		c.m1();//child_1
		c.m2();//child_2
		c.m3();//parent_1
		
		child_1 c1 =new child_1();
		c1.m1();//child_1
		c1.m3();//parent_1
		
		Parent_1 p=new Parent_1();
		p.m3();*/
		
		c1 c = new c1();
		c.c1();//c1
		c.display();//parent_p
		
		c2 c2=new c2();
		c2.c2();//c2
		c2.display();//parent_p
		
	}

}
