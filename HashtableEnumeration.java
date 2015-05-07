import java.util.Hashtable;
import java.util.Enumeration;

public class HashtableEnumeration{

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
		
		Enumeration<String> enmKeys = ht.keys();
		while(enmKeys.hasMoreElements())
		{
			String key = enmKeys.nextElement();
            System.out.println("Value of "+key+" is: "+ht.get(key));

		}
	}
}
