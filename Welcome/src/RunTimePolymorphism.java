import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

class Bike
{
	void run()
	{
		System.out.println("bike running");
	}
}
class Splendor extends Bike   //this is inheritance  Is-A Relationship Splendor is a Bike
{
	void run()
	{
		System.out.println("splendor running");
	}
	
}
public class RunTimePolymorphism {
	public static void main(String args[])
	{
		Bike s=new Splendor();
		s.run();
		
		/*Bike b=new Bike();
		b.run();
		Splendor s1=new Splendor();
		s1.run();
		ArrayList<Integer> i=new ArrayList<Integer>();
		i.add(10);
		i.add(11);
		i.add(12);
		i.add(10);
		System.out.println(i.size());
		for(Integer j:i)
		{
			System.out.println(j.byteValue());
		}
 		i.removeIf(m->(m%2==0));
		System.out.println(i.size());*/
		/*ArrayList<Integer> s=new ArrayList<Integer>();
		s.add(10);
		s.add(100);
		s.add(102);
		Iterator i=s.iterator();
		for(int j=1;j<=s.size();j++)
		{
			Object h=i.next();
			System.out.println(h);
		}*/
		
		
		
		
		
		
		 
		 
		
		
	}

}
