import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class IterateHashTable{
	
	public static void main(String[] args)
	{
		Hashtable<String, String> ht = new Hashtable<String,String>();
		ht.put("one","first entered" );
		ht.put("two", "second entered");
		ht.put("three", "third entered");
		ht.put("four", "fourth entered");
		ht.put("five", "fifth entered");
		System.out.println(ht);
		
		Set<String> keys = ht.keySet();
		for(String key : keys)
		{
			System.out.println("value of " +key +" is : "+ht.get(key));
		}
		Iterator<String> itr = keys.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
	}
}
