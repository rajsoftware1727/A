
public class MethodPractice {
	
	public int sum(int a,int b)
	{
		int c=a+b;
		return c;
	}
	
	public int difference(int a,int b)
	{
		int c=a-b;
		return c;
	}
	
	public int multiply(int a,int b)
	{
		int c=a*b;
		return c;
	}
	
	public int divide(int a,int b)
	{
		int c=a/b;
		return c;
	}
	
	
	public static void main(String args[])
	{
		MethodPractice m=new MethodPractice();
		System.out.println(m.sum(5,10));
		
	}

}
