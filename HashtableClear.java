/**
* Using clear method, you can delete or clear all the entries in a hash table
**/

import java.util.Hashtable;
 
public class HashtableClear {
 
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
    	
        System.out.println("Clearing Hashtable:");
        ht.clear();
        System.out.println("Content After clear:");
        System.out.println(ht);
    }
}
