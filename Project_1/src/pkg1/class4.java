package pkg1;

public class class4 
{
	private static class4 ref;

	public void m1()
	{
		
		System.out.println("Default method");
	}
	
	public void m2(int a)
	{
		System.out.println("one parametrized method");
	}
	
	public void m3(int a,int b)
	{
		System.out.println("Two parametrized method");
	}
	
	public void m4(int a,int b,int c)
	{
		System.out.println("Three parametrized method");
		this.m1();
		this.m2(34);
		this.m3(7,98);
		this.m4(4,7,5,3);
    }
	
	public void m4(int a,int b,int c,int d)
	{
		System.out.println("four parametrized method");
	}
	
	public static void main(String[] args)
	{
		class4.ref=new class4();
		ref.m4(45,89,80);
	}
}


