package datastructures;
import java.util.ArrayList;
import java.util.Iterator;

public class _04LinkedList {
	public static void main(String[] args)
	{
		student s1=new student("Prajesh","19BIT0422");//student object s1
		student s2=new student("Aditya","19BIT0139");//student object s2
	    ArrayList<student>myclass=new ArrayList<student>();//ArrayList to store the objects of class student
	    myclass.add(s1);//contents of object s1 is stored in ArrayList
	    myclass.add(s2);//contents of object s2 is stored in ArrayList
	    
	    //in order to traverse through the ArrayList, we'll create an iterator
	    Iterator<student> itr=myclass.iterator();
	    while(itr.hasNext()==true)
	    {
	    	student t=(student)itr.next();//every student object is stored in the variable 't' of type 'student'
	    	System.out.println(t.name+" "+t.regno);
	    }	    
	}
}
class student
{
	String name;
	String regno;
	public student(String n,String r)
	{
		this.name=n;
		this.regno=r;
	}
	public void display()
	{
		System.out.println(name+" "+regno);
	}
}
