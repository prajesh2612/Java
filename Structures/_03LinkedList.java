package datastructures;
import java.util.LinkedList;

public class _03LinkedList {
	public static void main(String[] args)
	{
		/*Creation of Linked list:
		 * Syntax- LinkedList<Data-type> variable name of the linked list=new LinkedList<>();*/
		LinkedList<String>s=new LinkedList<>();/*LinkedList 's' of String Data-type*/
		
		s.add("Prajesh");//Adding an element to the linked list
		s.add("Raj");
		s.add("Prajesh");
		s.add("Singh");
		s.add("Aditya");
		System.out.print("The Original LinkedList is:");
		System.out.println(s);
		
		s.add(3,"Abhijay");/*: Adds a new element at the specified position in the argument by pushing the elements in the right 
		                       towards rightward direction by one index.  
		                     : Here, the new element "Abhijay" would get added in the specified index position '3' of the LinkedList by
		                       pushing the former element at this position and the following elements in towards rightward direction by 
		                       one index */ 
		System.out.print("The modified LinkedList is (case 1):");
		System.out.println(s);
		
		s.set(2, "Hemant");//Here we are replacing the element at the index position '2' (i.e. "Prajesh") with new element "Hemant"
		System.out.print("The modified LinkedList is (case 2):");
		System.out.println(s);
		
		s.remove();//removes the first element in the LinkedList
		System.out.print("The modified LinkedList is (case 2):");
		System.out.println(s);
		s.remove(3);//Removes the element at index position 3 from the LinkedList
		System.out.print("The modified LinkedList is (case 3):");
		System.out.println(s);
		
		s.push("Harsha");/*: Here linkedList is used as a stack.
		                   : it pushes the element in the argument on the top of the LinkedList (or Stack)*/
		System.out.print("The modified LinkedList is (case 4):");
		System.out.println(s);
		
		s.pop();/*: Here linkedList is used as a stack.
                  : it pops the first (or topmost) element in the top of the LinkedList (or Stack)*/
        System.out.print("The modified LinkedList is (case 5):");
        System.out.println(s);
        
        s.clear();//Used to clear or empty the entire LinkedList
        System.out.print("The modified LinkedList is (case 6):");
        System.out.println(s);		
	}
}
