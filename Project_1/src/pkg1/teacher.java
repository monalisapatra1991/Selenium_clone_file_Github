package pkg1;

public class teacher {
int rollno;int age;
public void method1()  //method name 
{ // Boundary of the method
	
	System.out.println("display 1 msg");
	}
public void method2()  //method name 
{ // Boundary of the method
	
	System.out.println("display 2 msg");
	}
public static void main(String[] args) 
{
	teacher abc=new teacher();
	abc.method1(); //called the method 1
	abc.method2(); //called the method 2
	abc.rollno=123;
	System.out.println(abc.rollno);
	abc.age=40;
	System.out.println(abc.age);
	
}
}



