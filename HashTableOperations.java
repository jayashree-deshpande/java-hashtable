import java.util.Hashtable;

public class HashTableOperations{
	
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
		//getting value for the given key from hashtable
		System.out.println("value of key 'three': "+ ht.get("three"));
		System.out.println("Is hash table empty: "+ ht.isEmpty());
		System.out.println("before remove: "+ ht);
		ht.remove("four");
		System.out.println("after remove: "+ht);
		System.out.println("size of the hash table: "+ ht.size());
		
	}
}
