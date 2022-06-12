package pkg1;

public class Automationmethod
{
  
	public void m1()
	{
		System.out.println("parent default method");
		this.m3(87,78);
	}
	
	public void m2(int a)
	{
		
		System.out.println("parent one parametrized method");
	}
	

	public void m3(int a,int b)
	{
		this.m2(78);
		System.out.println("parent two parametrized method");
	}
	
	public void m4(int a,int b,int c)
	{
		System.out.println("parent three parametrized method");
		this.m1();
		
	}
	
}

