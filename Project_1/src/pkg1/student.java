 package pkg1;

public class student {
//Boundary of the class
	int a;//Variable
	public void deepak()  //method name 
	{ // Boundary of the method
		
		System.out.println("Welcome to all of you");
		}
	public static void main(String[] args) 
	{
		student abc=new student();
		abc.deepak(); //called the method deepak
		abc.a=123;
		System.out.println(abc.a);
		abc.a=456;
		System.out.println(abc.a);
	}
	
}
