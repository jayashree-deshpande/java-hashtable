import java.util.HashMap;
import java.util.Hashtable;

public class HashTableCopy{
	
	public static void main(String[] args)
	{
		Hashtable<String, String> ht = new Hashtable<String,String>();
		ht.put("one","first entered" );
		ht.put("two", "second entered");
		ht.put("three", "third entered");
		ht.put("four", "fourth entered");
		ht.put("five", "fifth entered");
		System.out.println(ht);
		
		HashMap<String, String> myMap = new HashMap<String, String>();
		myMap.put("s1", "S1 VALUE");
		myMap.put("s2", "S2 VALUE");
		
		ht.putAll(myMap);
		System.out.println("Hash table after coping myMap to it \n"+ ht);
	}
}
