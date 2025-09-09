package inheritence;
//Different project sub class
import pack1.Main;

public class ClassE extends Main
{

	public static void main(String[] args) 
	{
		System.out.println("Different project sub Class :-");
		System.out.println();
		System.out.println(ClassE.q);
		System.out.println(ClassE.s);
		System.out.println();
		System.out.println(ClassE.functionB());
		System.out.println(ClassE.functionD());
		System.out.println();
		
		ClassE objE = new ClassE();
		System.out.println(objE.q1);
		System.out.println(objE.s1);
		System.out.println();
		
		System.out.println(objE.functionB1());
		System.out.println(objE.functionD1());

	}

}
