package datastructures;

import java.util.ArrayList;
import java.util.Iterator;

public class _02ArrayList {
	public static void main(String[] args)
	{
		//Here we'll create an ArrayList using another ArrayList
		ArrayList<String>t=new ArrayList<>();//ArrayList t
		t.add("Ram");
		t.add("Mohan");
		t.add("Ram");
		
		ArrayList<String>s=new ArrayList<>(t);/*: ArrayList s
		                                        : Here, we are appending the ArrayList 't' to ArrayList 's' by passing ArrayList 't' as
		                                          the argument to the ArrayList 's'.*/
		s.add("Prajesh");
		s.add("Raj");
		s.add("Singh");
		s.add("Aditya");
		s.add("Raj");
		s.add("Aditya");
		s.add("Satish");
		
		
		//Now we'll traverse the modified ArrayList 's' ('s'='s'+'t') (here we'll use the method of: Iteration)
		Iterator<String> itr1=s.iterator();
		while(itr1.hasNext()==true)
		{
			String k1=(String)itr1.next();
			System.out.println(k1);
		}
		System.out.println(" ");
		
		
		/*If we want to remove all the elements of the ArrayList 't' from the ArrayList 's', we'll use the method
		 *removeAll (ArrayList name)*/
		System.out.println("On removing ArrayList 't' from the modified ArrayList 's':");
		s.removeAll(t);
		//Now we'll traverse the modified ArrayList 's' ('s'=('s'+'t')-'t') (here we'll use the method of: Iteration)
		Iterator<String> itr2=s.iterator();
		while(itr2.hasNext()==true)
		{
			String k2=(String)itr2.next();
			System.out.println(k2);
		}	
		System.out.println(" ");
		
		
		s.addAll(t);/*we can also use this method to append two ArrayLists. here we are appending ArrayList 't' to ArrayList 's' i.e.
		              's'='s'+'t'*/
		
		/*If we want to retain all the elements of the original ArrayList 's' from the modified ArrayList 's' ('s'='s'+'t'), we'll use
		 *retainAll(The name of ArrayList which you want to retain) method*/
		System.out.println("On retaining ArrayList 's' from the modified ArrayList 's' ('s'='s'+'t'):");
		s.retainAll(s);
		//Now we'll traverse the retained ArrayList 's'(here we'll use the method of: Iteration)
		Iterator<String> itr3=s.iterator();
		while(itr3.hasNext()==true)
		{
			String k3=(String)itr3.next();
			System.out.println(k3);
		}		
	}
}
