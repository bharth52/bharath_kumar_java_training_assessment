package collections;
import java.util.ArrayList;
import java.util.List;


public class arrraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l1=  new ArrayList<>();
		l1.add("anbu");
		l1.add("guna");
		l1.add("senthil");
		l1.add("anbu");

		System.out.println("value present");
		for(String s1:l1)
		{
			System.out.println(s1);
		}
		l1.add(2,"dhamu");
		System.out.println("after adding");
		for(String s1:l1)
		{
			System.out.println(s1);
			l1.get(1);
		}
		l1.remove("anbu");
		System.out.println(" after removing adding");
		for(String s1:l1)
		{
			System.out.println(s1);
			
		}
		
;
//allow duplicates and index order and be printed in structured way line by line

	}

}
