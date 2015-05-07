import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;

public class GetHashtableEntrySet{
	
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
		
		Set<Entry<String, String>> entries = ht.entrySet();
		for(Entry<String, String> ent: entries){
			System.out.println(ent.getKey() + "==> "+ ent.getValue());
		}
		
	}
}
