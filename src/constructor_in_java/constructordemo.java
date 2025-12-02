package constructor_in_java;
class Product{
	String prodname;
	float price;
	
	Product(){
	
		prodname = "tv";
		price = 99.33f;
	}
	Product(String prodname,float price){
		this.prodname = prodname;
		this.price=price;
	}
	void displayproduct()
	{
		System.out.println("productname"+prodname+" and the price is "+price);
		
	}
}

public class constructordemo {
     public static void main(String[] args)
     {
    	 Product n1= new Product();
    	 n1.displayproduct();
    	 Product n2 = new Product(" radio",7899.50f);
    	 n2.displayproduct();
    	 
    	 
    	 
     }
}
