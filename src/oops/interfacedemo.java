package oops;
class Printer implements printable_for_interface{
	
	public void print()
	{
		System.out.println(printername+" is printing");
	}
}
public class interfacedemo {
	public static void main(String[] args)
	{
		printable_for_interface p1 = new Printer();
		p1.print();
	}
	

}
