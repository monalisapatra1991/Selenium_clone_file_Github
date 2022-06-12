package pkg1;

public class Class2asgn3 
{
  public int sub(int a,int b)
  {
	    int c;
		c=a-b;
	    System.out.println("sub result is" +c);
		return c; // return sub of a+b
   }
  public int sum(int x,int y)
	{
	    int z;
		z=x+y;
	    System.out.println("sum result is" +z);
		return z; // return sum of x-y
   }
  public int mul(int x1,int x2)
	{
	    int x3;
		x3=x1*x2;
	    System.out.println("Final result is" +x3);
	    return x3;
	}
  public void div(int x3,int x4)
	{
	    int x5;
		x5=x3/x4;
	    System.out.println("Final result is" +x5);
	
	}
  public static void main(String[] args) 
  {
	  Class2asgn3 mon=new Class2asgn3();
	  int subresult=mon.sub(10, 2);
	  int sum=mon.sum(subresult, 2);
	  int sub=mon.sub(sum, 2);
	  int mul1=mon.mul(sub, 2);
	  mon.div(mul1, 2);
	  
}
}
