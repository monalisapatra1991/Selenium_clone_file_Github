package pkg1;

public class Class3 
{
  public Class3()
  {
	  this(67,90,78);
	 System.out.println("Default Constructor");
	
  }
  public Class3(int a,int b)
  {
	  this();
	 System.out.println("Two parametrized Constructor");
  }
  
  public Class3(int a)
  {
	  this(2,8);
	 System.out.println("one parametrized Constructor");
  }
  
  public Class3(int a,int b,int c)
  {
	
	 System.out.println("Three parametrized Constructor");
  }
  
  public Class3(int a,int b,int c,int d)
  {
	  this(34);
	 System.out.println("Four parametrized Constructor");
  }
  public static void main(String[] args) 
  {
	  
	  Class3 ob1=new Class3(24,5,3,67);
	  
}
}

