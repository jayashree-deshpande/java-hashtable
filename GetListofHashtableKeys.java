import java.util.*;

public class GetListofHashtableKeys{
	
	public static void main(String[] args)
	{
		Hashtable<String, String> ht = new Hashtable<String, String>();
		//add key-value pair to Hashtable
		ht.put("one", "first inserted");
		ht.put("two", "second inserted");
		ht.put("three", "third inserted");
		ht.put("four", "fourth inserted");
		ht.put("five", "fifth inserted");
		System.out.println(ht);
		
		Set<String> keys = ht.keySet();
		for(String key: keys)
		{
			System.out.println(key);
		}
	}
}
