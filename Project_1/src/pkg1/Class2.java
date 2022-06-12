package pkg1;

public class Class2
{
	public int sum(int a,int b)
	{
	    int c;
		c=a+b;
	    System.out.println("sum result is" +c);
		return c; // return sum of a+b
     }
	public int sub(int x,int y)
	{
	    int z;
		z=x-y;
	    System.out.println("substract result is" +z);
		return z; // return substract of x-y
     }
	
	public void mul(int x1,int x2)
	{
	    int x3;
		x3=x1*x2;
	    System.out.println("Final result is" +x3);
	
		}
	public static void main(String[] args) 
	{
		Class2 mon=new Class2();  
		
        int sumresult=mon.sum(10, 2);
		int subresult=mon.sub(10, 2);
		mon.mul(sumresult, subresult);
		
		
	}
}


