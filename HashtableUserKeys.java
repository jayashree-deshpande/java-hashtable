
import java.util.Hashtable;
 
public class HashtableUserKeys {
 
    public static void main(String a[]){
 
        Hashtable<Emp,String> ht = new Hashtable<Emp, String>();
        ht.put(new Emp(134,"Ram",3000), "RAM");
        ht.put(new Emp(235,"John",6000), "JOHN");
        ht.put(new Emp(876,"Crish",2000), "CRISH");
        ht.put(new Emp(512,"Tom",2400), "TOM");
        System.out.println("Fecthing value by creating new key:");
         
        Emp e = new Emp(512,"Tom",2400);
        System.out.println(e+" ==> "+ht.get(e));
    }
}

class Emp{
	private String name;
	private int salary;
	private int id;
	
	public Emp(int id, String n, int s){
		this.id = id;
		this.name = n;
		this.salary = s;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public int getSalary(){
		return salary;
	}
	
	public void setSalary(int salary){
		this.salary = salary;
	}
	
	public int getId() {
        return id;
    }
	
	public void setId(int id) {
        this.id = id;
    }
	
	public String toString(){
		return "id "+ this.id+"--Name"+ this.name +"--Salary"+ this.salary;
		
	}
	
	public int hashCode()
	{
		System.out.println("In hashcode");
        return this.getId();
	}
	
	public boolean equals(Object obj){
		Emp e = null;
		if(obj instanceof Emp)
		{
			e=(Emp) obj;
		}
		 System.out.println("In equals");
	        if(this.getId() == e.getId()){
	            return true;
	        }
	        else{
	            return false;
	        }
	}
}
