package collections;
import java.util.HashMap;
import java.util.Map;

public class hastable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Map<Integer,String> m1 = new HashMap<>();
		
		m1.put(100,"bharath");
		m1.put(200,"hari");
		m1.put(500,"deva");
		m1.put(700, null);
 		
		for(Map.Entry<Integer,String> map:m1.entrySet())
		{
			System.out.println("key:" + map.getKey()+"Value:"+map.getValue());
		}
	}
	}
//diff is we cant use null value 
//HashMap: allows one null key and multiple null values. Hashtable & TreeMap: do NOT allow null keys (Hashtable also disallows null values).