package datastructures;

public class _000collectionIntro 
{
	/*Collection: A collection represents a group of objects, known as elements.
	 *          : It is an interface which consists of these various abstract methods:
	 *            a. Add(E e)- Adds an object
	 *            b. remove(Object o)- Removes a specific object.
	 *            c. size()- Returns the number of elements in this collection.
	 *            d. isEmpty()- Returns 'true' if collection is empty.
	 *            e. Contains(object)- Checks if the collection contains a specified element.
	 *            f. Clear()- Removes all elements from a collection.
	 *          
	 *
	 *Lists: It is special type of collection (of objects) where:
	 *       a. Duplicate elements (or objects) are allowed.
	 *       b. Order of insertion (or the index of elements) are maintained.
	 *      
	 *     : List is an interface which extends 'collection' interface, i.e. the abstract methods present in the 'collection' interface
	 *       is also used by the Lists
	 *     
	 *     : List also has some special kinds of methods:
	 *       a. add(int index, E element)- insert an element in a specified index position.
	 *       b. Get(int index)- Return the element at the specified index position in the list.
	 *       c. set(int index, E element)- Replace an element in the specified index position.
	 *       d. Remove(int index)- remove an element from the specified index position.
	 *       e. indexOf(Object o)- returns the index position of an object
	 *      
	 *     : There are two types of Lists:
	 *       a. ArrayList- implements the 'List' interface
	 *       b. Vector- implements the 'List' interface
	 *      
	 *       a. ArrayList: It is a type of 'List' where we can store all elements on Contiguous memory Blocks.
	 *                   : It uses an array to store the objects in the list. For instance when you are adding an object.
	 *                   : It uses a dynamic array- The array size can grow or shrink during the execution of the program.
	 *                   : It can contain duplicate elements.
	 *                   : Insertion Order (Index) of the elements is maintained.
	 *                   : Retrieval of elements happen using the index.
	 *                   : The index starts from 0.
	 *                   
	 *                   :Creating an Empty ArrayList of a certain Data-Type:
	 *                     ArrayList<Data-Type>s(<-variable name of the ArrayList)=new ArrayList<>();
	 *                     
	 *                     Eg: Creating an empty ArrayList of Strings:
	 *                         ArrayList<String> s=new ArrayList<>();
	 *                     
	 *                   : Methods for ArrayList:
	 *                   a. public boolean add(E e)- Appends the specified element to the end of this list.
	 *                   b. public void add(int index, E element)- inserts the specified element at the specified index position in
	 *                                                             this list. 
	 *                                                           - Shifts the element currently at that position (if any) and any 
	 *                                                             subsequent elements to the right.
	 *                   c. public E remove(int index)- Removes the element at the specified position in this list.
	 *                   d. public void clear()- Removes all of the elements from this list.
	 *                   e. public int size()- returns the size of the ArrayList
	 *                   f. public boolean isEmpty()- returns 'true' if this list contains no elements.
	 *                   g. set(int index, E element)- replace the element at index i
	 *                   h. public boolean contains(Object o)- Returns 'true' if this list contains the specified element.
	 *                   i. public int indexOf(Object o)- returns the index of the first occurrence of the specified element in this list,
	 *                                                    or -1 if this list does not contain the element.
	 *                   j. public int lastIndexOf(Object o)- returns the index of the last occurrence of the specified element.
	 *                   k. public Object clone()- returns a shallow copy of this ArrasyList instance.
	 *                  
	 *           
	 *                    
	 *       */

}



