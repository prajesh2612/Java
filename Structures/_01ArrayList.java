package datastructures;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class _01ArrayList {

	public static void main(String[] args) {
		ArrayList<String>s=new ArrayList<>();
		s.add("Prajesh");
		s.add("Raj");
		s.add("Singh");
		s.add("Aditya");
		s.add("Raj");
		s.add("Aditya");
		s.add("Satish");
		
		
		//Here we'll see how we can traverse an ArrayList
		
		//1. Use a for loop
		System.out.println("Method 1: Using for loop");
		int l=s.size();
		for(int i=0;i<l;i++)
		{
			String k1=s.get(i);
			System.out.println(k1);
		}
		System.out.println(" ");
		
		//2. Use for-each consumer action
		System.out.println("Method 2: Use for-each consumer action");
		for(String k2:s)
		{
			System.out.println(k2);
		}
		System.out.println(" ");
		
		//3. Iterator: this concept of traversing is mainly used in the case of Linked-Lists
		System.out.println("Method 3: Iterator");		
		/*- While traversing the ArrayList, the 'Iterator' traverse from index 0 to end
		 *- Iterator is a interface which consists of a method: iterator()
		 *- iterator() method is used to iterate over the elements in the list in proper sequence.
		 *- Syntax: Iterator<Data-Type> iterating object name= <name of ArrayList>.iterator();*/
		Iterator<String> itr=s.iterator();
		while(itr.hasNext()==true)/*: hasNext() method is used to check whether the iterating object can find the next element in the 
		                              ArrayList or not.
		                            : If there is a next element present in the ArrayList, then the method would return 'true' else it
		                              would return 'false'
		                            : The 'while' loop would continue until hasNext() returns 'true', it would stop as soon as the 
		                              method returns 'false'*/
		{
			String k3=(String)itr.next();//Reads the ArrayList element at a particular iteration and stores it into k3
			System.out.println(k3);
		}
		System.out.println(" ");
		
		//4. ListIterator- can be only used on collections of type 'List'
		System.out.println("Method 4: ListIterator");
		/*- While traversing the ArrayList, the 'ListIterator' can also traverse from final index to start (or Index no.: 0)
		 *- Here everything is same as Iterator (in previous case), only this different is that, instead of class 'Iterator' and method
		 *  'iterator()' we'll be using class 'ListIterator' and method 'listIterator()'*/
		System.out.println("1. Traversing from begining:");
		ListIterator<String> litr1=s.listIterator();
		while(litr1.hasNext()==true)
		{
			String k4=(String)litr1.next();
			System.out.println(k4);
		}
		System.out.println(" ");
		
		System.out.println("2. Traversing from end:");
		ListIterator<String> litr2=s.listIterator(s.size());/*In order to traverse from end, we'll put the size of the ArrayList as the
		                                                      argument of the method 'iterator'*/
		while(litr2.hasPrevious()==true)
		{
			String k5=(String)litr2.previous();
			System.out.println(k5);
		}
		System.out.println(" ");

	}

}
