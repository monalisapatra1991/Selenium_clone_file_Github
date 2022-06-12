package pkg1;

public class Selenium extends Automation
{
	public Selenium()
	{
		super(7,6);
		System.out.println("child default constructor");
	}

	public Selenium(int a)
	{
		this(7,8);
		System.out.println("child one parametrized constructor");
	}
    
	public Selenium(int a,int b)
	{
		this(9,8,6);
		System.out.println("child two parametrized constructor");
	}
	
	public Selenium(int a,int b,int c)
	{
		this();
		System.out.println("child three parametrized constructor");
	}
	
	public static void main(String[] args)
	{
		Selenium ref=new Selenium(78);
		
	}

}
