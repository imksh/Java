package inheritence;

import pack1.Main;

//Different Project Non Sub class
public class ClassF 
{

	public static void main(String[] args) 
	{
		System.out.println("Different project non sub Class :-");
		System.out.println();
		System.out.println(Main.q);
		System.out.println();
		System.out.println(Main.functionB());
		System.out.println();
		
		Main objMain = new Main();
		System.out.println(objMain.q1);	
		System.out.println();
		System.out.println(objMain.functionB1());

	}

}
