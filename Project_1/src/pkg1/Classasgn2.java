package pkg1;

import java.util.Scanner;

public class Classasgn2 
{
	public int sum(int x1,int x2)
	  {
		    int c;
			c=x1+x2;
			return c; // return sum of x1+x2
	   }
	
	public int sub(int x1,int x2)
	  {
		    int c;
			c=x1-x2;
			return c; // return sub of x1-x2
	   }
	public int mul(int x1,int x2)
	  {
		    int c;
			c=x1*x2;
			return c; // return mul of x1*x2
	   }
	public void div(int x1,int x2)
	  {
		    int div=x1/x2;
			System.out.println("final result" +div);
	   }
	public static void main(String[] args)
    
   {
      // ((((x1+x2)-x3)+x4)*x5)/x6)
		//((((10+5)-5)+10)*4)/8)
		
	Scanner s=new Scanner(System.in);
	Classasgn2 ref=new Classasgn2();
	System.out.println("enter value of x1");
	int x1=s.nextInt();
    System.out.println("enter value of x2");
    int x2=s.nextInt();
    System.out.println("enter value of x3");
    int x3=s.nextInt();
    System.out.println("enter value of x4");
    int x4=s.nextInt();
    System.out.println("enter value of x5");
    int x5=s.nextInt();
    System.out.println("enter value of x6");
    int x6=s.nextInt();
    int sumresult=ref.sum(x1,x2);
    int subresult=ref.sub(sumresult,x3);
    int sumresult2=ref.sum(subresult,x4);
    int mulresult=ref.mul(sumresult2,x5);
    ref.div(mulresult, x6);
    
 }	
	
}



