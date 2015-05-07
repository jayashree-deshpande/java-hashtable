import java.util.Hashtable;
import java.util.Set;

public class HashtableKeySearch{
	public static void main(String[] args)
	{
		//Create hashtable instance
		Hashtable<String,String> ht = new Hashtable<String, String>();
				
		//add key-value pair to hashtable
		ht.put("one", "first inserted");
		ht.put("two", "second inserted");
		ht.put("three", "third inserted");
		ht.put("four", "fourth inserted");
		ht.put("five", "fifth inserted");
		System.out.println(ht);
		
		if(ht.containsKey("first"))
		{
            System.out.println("The Hashtable contains key first");
        } else {
            System.out.println("The Hashtable does not contains key first");
        }
		
		String str = "four";
		Set<String> keys = ht.keySet();
		for(String key : keys)
		{
			
			if(key.equals(str))
				System.out.println("key found and the vlaue for that key is = "+ ht.get(key));
			
			break;
		}
	}
}
