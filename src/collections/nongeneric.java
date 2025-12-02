package collections;
import java.util.ArrayList;
import java.util.List;
public class nongeneric {
	public static void main(String[] args)
	{
		List l1 = new ArrayList<>();
		
		l1.add(100);
		l1.add("java");
		
	    String  s1= (String)l1.get(1);
	}

}

