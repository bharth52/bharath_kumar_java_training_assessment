package collections;
import java.util.TreeMap;
import java.util.Map;
public class treemap {
	public static void main(String[] args)
	{
		Map<Integer,String> m1 = new TreeMap<>();
		
		m1.put(100,"bharath");
		m1.put(200,"hari");
		m1.put(500,"deva");
		m1.put(null,"Mirzuu");
 		
		for(Map.Entry<Integer,String> map:m1.entrySet())
		{
			System.out.println("key:" + map.getKey()+"Value:"+map.getValue());
		}
	}

}
//in order wise and null is not allowd but null can be in value
//HashMap: allows one null key and multiple null values. Hashtable & TreeMap: do NOT allow null keys (Hashtable also disallows null values).