package collections;
import java.util.HashSet;
import java.util.Set;


public class hashset {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Float> l1=  new HashSet<>();
		l1.add(398.2f);
		l1.add(47.3f);
		l1.add(33.4f);
		l1.add(4.3f);
		System.out.println(l1);
		for(Float z:l1)
		{
			
			System.out.println(z);
		}
		
		

 

	}

}

//cant allow duplicates and not index specific and it is unstructuredway