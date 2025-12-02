package collections;
import java.util.HashMap;
import java.util.Map;
public class hashmap {
	public static void main(String[] args)
	{
		Map<Integer,String> m1 = new HashMap<>();
		
		m1.put(100,"bharath");
		m1.put(200,"hari");
		m1.put(500,"deva");
 		
		for(Map.Entry<Integer,String> map:m1.entrySet())
		{
			System.out.println("key:" + map.getKey()+"Value:"+map.getValue());
		}
		m1.remove(200);
		for(Map.Entry<Integer,String> map:m1.entrySet())
		{
			System.out.println("key:" + map.getKey()+"Value:"+map.getValue());
		}
		
	}

}
//HashMap: allows one null key and multiple null values. Hashtable & TreeMap: do NOT allow null keys (Hashtable also disallows null values).