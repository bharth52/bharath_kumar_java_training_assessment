package oops;

public class Polymorphism {
	int empn=1234;
	String em="bharath";
	int display()
	{
		return empn;
	}
	void display(int a)
	{
		System.out.println(empn);
	}
	void display(String name)
	{
		System.out.println("em");
	}
	void display(int a,float b)
	{
		System.out.println("a is"+a+"b is "+b);
	}
	void display(int a,String name)
	{
		System.out.println("a is"+a+"b is "+name);

	}


   public static void main(String[] args)
   {
	   Polymorphism poly = new Polymorphism();
	   poly.display(52);
			   
   }
   }

