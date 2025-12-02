package oops;

abstract class phone{
	 abstract void call();
	
	 {
		System.out.println("bowing");
	 }

	 protected abstract void browing();
}
class Iphone extends phone{
	void call()
	{
		System.out.println("Calling");
	}
	protected void browing()
	 {
		System.out.println("bowing bro");
	 }
		
	}
public class abstractdemo {
	public static void main(String[] args) {
		phone  mp =new Iphone();
		mp.call();
		mp.browing();
				
	}
	

}
// it is hiding place only printableabstractdemo will be seen by user