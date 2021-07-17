package datastructures;

import java.util.ArrayList;

public class _00ArrayLists {
	public static void main(String[] args)
	{
		ArrayList<String> s=new ArrayList<>();//creation of a string type ArrayList 's'  
		s.add("Prajesh");//adding a string type object (or element, here: Prajesh) into the ArrayList
		s.add("Satish");
		s.add("Aditya");
		s.add("Jeff");
		int l=s.size();/*size() method is used to return the length of the ArrayList, here it would return l=4 as the size of the
		                 ArrayList because we have entered 4 elements into the ArrayList 's' */
		System.out.println(l);
		
		//In order to get all the element in the ArrayList, we'll use loop
		for(int i=0;i<l;i++)
		{
			String k=s.get(i);/*get(<index>) method is used to access elements in the ArrayList based on the index in the argument of
			                    the get() method. That string of the specific index position would get stored in the String variable k*/
			System.out.println(k);
		}
		System.out.print("The old list:");
		System.out.println(s);
		
		s.add(2,"Ram");/*: Here we are modifying the existing ArrayList by moving whatever element is stored in the specified index
		                   (in the argument) towards right along with the elements following that element and adding the new element
		                    as specified in the argument.
		                 : Here, the arguments are: 2 and "Ram", hence here we are trying to move whatever is present in the index 
		                   position '2' towards the right direction, i.e. its new index position will be '3' and the following elements
		                   would also be moved towards right with their respective Index(new)=Index(old)+1, in the ArrayList and we'll
		                    store "Ram" in that place newly formed empty index (2).*/
		System.out.print("The new list (case 1):");
		System.out.println(s);
		
		s.remove(3);/*: remove(<index>) method is used to remove the element from the ArrayList from the index position as specified in
		                in the argument of the remove() method
		              : it would also pull the subsequent elements of the following indices by decreasing their index position by 1.*/
		System.out.print("The new list (case 2):");
		System.out.println(s);
		
		s.clear();//clear() method is used to clear or empty the entire ArrayList
		System.out.println("The new list (case 3):");
		System.out.println(s);
		
		boolean t=s.isEmpty();/*: isEmpty() method returns true; if the ArrayList is empty else it'll return 'false'
		                        : here, since we have already emptied or cleared our entire ArrayList in the previous step, hence this
		                          method would return 'true' in this case*/
		System.out.println(t);
		
		//Again re-entering the elements in the ArrayList 's'
		s.add("Prajesh");
		s.add("Satish");
		s.add("Aditya");
		s.add("Jeff");
		s.add("Aditya");
		System.out.print("The new list (case 4):");
		System.out.println(s);
		boolean t1=s.contains("Prajesh");/*: contains(Element or Object) method is used to search the element in the argument of the 
		                                     method contains(), whether that element is present in the ArrayList or not.
		                                   : if the element is present, then the method would return 'true', else it would return
		                                     'false'.
		                                   : Here, since element "Prajesh" is already present in the ArrayList 's', hence it would
		                                     return 'true'*/
		boolean t2=s.contains("Ram");/*Here, since element "Prajesh" is already present in the ArrayList 's', hence it would return 
		                               'false'*/
		System.out.println(t1+" "+t2);
		
		int a=s.lastIndexOf("Aditya");/*: lastIndexOf(Element or Object) would return the index of the last occurrence of the element
		                                  as specified in the argument of the lastIndexOf() method, in the ArrayList 's'
		                                : this method starts to searching for that element in the ArrayList from the backward direction
		                                : here, since element "Aditya" has occurred two times in ArrayList (index position 2 and 4), 
		                                  hence this method would return the index of its last occurrence, i.e '4'*/
		System.out.println(a);
		
		s.set(2, "Ram");/*Here we are replacing the element at index position '2' in the ArrayList 's' with new element "Ram"*/
		System.out.print("The new list (case 5):");
		System.out.println(s);
		
		
		//Cloning
		ArrayList<String> k=(ArrayList<String>) s.clone();//Here we are trying to clone the ArrayList 's' to ArrayList 'k'
		/*The syntax is:
		 * ArrayList<data-type>(name of ArrayList)=(ArrayList<Data-type>) s.clone()
		 *              ^                                   ^
		 *              |                                   |
		 *              |                            (Type-Casting of clone() into ArrayList of the specific data-type)
		 *       (Should be same as the data-type of the ArraList which we'll clone)*/
		System.out.print("The cloned list is:");
		System.out.println(k);	
		
	}
}
