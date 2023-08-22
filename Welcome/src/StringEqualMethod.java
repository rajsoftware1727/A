import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.*;

class Employee
{
	String name;
	int salary;
    boolean Equal(Object o)
	 {
    	if(this==o)
    		return true;
    	if(o==null)
    		return false;
    	if(this.getClass()!=o.getClass())
    		return false;
    	Employee e=(Employee)o;
    	return this.name.equals(e.name)&&this.salary==e.salary;
    		
    	
		 
	 }
	 Employee(String n,int h)
	 {
		 this.name=n;this.salary=h;
		 
	 }
}
public class StringEqualMethod {
	public static void main(String args[])
	{
		Employee e1=new Employee("Rajesh",5000);
 		Employee e2=new Employee("Rajesh",5000);
		Employee e3=new Employee("Akila",10000);

		System.out.println(e2.name);
		System.out.println(e1.Equal(e2));
		Set<Integer> s=new HashSet<Integer>();
		
		s.add(100);
		s.add(200);
		s.add(100);
		s.add(300);
		for(Integer d:s)
		{
			System.out.println(d.intValue());
		}
		
		
		

	}

}
