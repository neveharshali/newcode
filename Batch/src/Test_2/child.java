package Test_2;

import Test_1.parent;

public class child extends parent {

	public static void main(String[] args) {
		child child=new child();
		System.out.println(child.w);//public
		System.out.println(child.x);//private
		//System.out.println(child.y);//protected
		//System.out.println(child.z);//default

	}

}
