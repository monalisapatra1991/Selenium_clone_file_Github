package pkg1;
public class seleniummethod extends Automationmethod
{
	public void method1()
	
	   {
		
		System.out.println("child default method");
		}
	
	public void method2(int a)
	
	{    
		System.out.println("child one parametrized method");
		this.method4(89,65,43);
	}
	
public void method3(int a,int b)
	
	{
	super.m4(34,67,89);	
	System.out.println("child two parametrized method");
		this.method1();
		this.method2(87);		
	}

	public void method4(int a,int b,int c)
	{ 
		System.out.println("child three parametrized method");
	}
	
	public static void main(String[] args)
	{
		
    seleniummethod ref=new seleniummethod();
	ref.method3(89,89);
	
	}
	
}

