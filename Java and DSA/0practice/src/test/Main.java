package test;


public class Main 
{
	public static void main(String[] args) 
	{
		int n =4;
		int ans =sum(n);
		System.out.println(ans);
	}

	private static int sum(int n) 
	{
		if(n==0) return 0;
		
		return ((n*2)-1)+sum(n-1);
	}
	
	
}

