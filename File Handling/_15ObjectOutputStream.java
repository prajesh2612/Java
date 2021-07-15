package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class _15ObjectOutputStream 
{
	public static void main(String[] args) 
	{
		try
		{
			/*:ObjectOutputStream is used in serialization where the object of this class (ObjectOutputStream), writes the contents on the
			   file which are serialized into a series of bits(1 & 0)
			  :it is used to write objects of a class, which implements interface Serializable, onto the target file.*/
			
			Student t=new Student("Prajesh","19BIT0422");//We are going to write this object to the file "prajesh7.txt"
			FileOutputStream fout=new FileOutputStream("prajesh7.txt");
			ObjectOutputStream objout=new ObjectOutputStream(fout);
			
			objout.writeObject(t);/*this method of ObjectOutputStream would write the contents of the object (here: name and regno) onto
			                        the target file*/
			objout.close();
			fout.close();
			
			/*ObjectInputStream is used in de-serialization where the object of this class (ObjectInputStream), reads the contents of the
			 *file which are serialized into a series of bits and decodes those bits into a human readable form*/
			
			File obj=new File("prajesh6.txt");
			FileInputStream fin=new FileInputStream(obj);
			ObjectInputStream objin=new ObjectInputStream(fin);
			
			Student inStudent=null;/*An empty object of type student which we'll use to read the text file and store its Serialized 
			                         contents in the variable inStudent*/
			inStudent=(Student)objin.readObject();//Type-Casting the serialized data which is read from the file in into Student object
			System.out.println(inStudent.name+" "+inStudent.regno);
			objin.close();
			fin.close();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
    }
}
class Student implements Serializable 
{
	String name,regno;
	public Student(String n1,String r1)
	{
		super();
		this.name=n1;
		this.regno=r1;
	}
}

