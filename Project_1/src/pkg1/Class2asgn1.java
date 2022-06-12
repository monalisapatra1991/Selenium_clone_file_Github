package pkg1;

public class Class2asgn1 
{
  public int sum(int a,int b)
  {
	    int c;
		c=a+b;
	    System.out.println("sum result is" +c);
		return c; // return sum of a+b
   }
  public int sub(int a,int b)
	{
	    int c;
		c=a-b;
	    System.out.println("substract result is" +c);
		return c; // return substract of a-b
   }
  public int mul(int a,int b)
	{
	    int c;
		c=a*b;
	    System.out.println("Final result is" +c);
	    return c;
	}
  public void div(int a,int b)
	{
	    int c;
		c=a/b;
	    System.out.println("Final result is" +c);
	
	}
  public static void main(String[] args) 
  {
	  Class2asgn1 mon=new Class2asgn1();
	  int sumresult=mon.sum(10, 2);
	  int sum2=mon.sum(sumresult, 2);
	  int sub=mon.sub(sum2, 2);
	  int mul1=mon.mul(sub, 2);
	  mon.div(mul1, 2);
	  
}
}
