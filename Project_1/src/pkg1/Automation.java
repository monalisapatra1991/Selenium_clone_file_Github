package pkg1;

public class Automation 
{
	public Automation()
	{
		this(78,98,45);
		System.out.println("Parent default constructor");
	}

	public Automation(int a)
	{
		this();
		System.out.println("Parent one parametrized constructor");
	}
    
	public Automation(int a,int b)
	{   
		this(67);
		System.out.println("Parent two parametrized constructor");
	}
	
	public Automation(int a,int b,int c)
	{
		System.out.println("Parent three parametrized constructor");
	}

}
