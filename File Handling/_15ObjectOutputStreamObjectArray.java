package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class _15ObjectOutputStreamObjectArray
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		try
		{
			int i;
			String name,empid,address,phnnumber;
			employee p[]=new employee[2];
			FileOutputStream fout=new FileOutputStream("employee.txt");
			ObjectOutputStream objout=new ObjectOutputStream(fout);
			for(i=0;i<2;i++)
			{
				System.out.println("Enter the name of the employees:");
				name=in.nextLine();
				System.out.println("Enter the empid of the employees:");
				empid=in.nextLine();
				System.out.println("Enter the address of the employees:");
				address=in.nextLine();
				System.out.println("Enter the phnnumber of the employees:");
				phnnumber=in.nextLine();
				p[i]=new employee(name,empid,address,phnnumber);
				objout.writeObject(p[i]);
			}
			objout.writeObject(new endoffile());
			objout.close();
			fout.close();
			
			File obj=new File("employee.txt");
			FileInputStream fin=new FileInputStream(obj);
			ObjectInputStream objin=new ObjectInputStream(fin);
			
			Object obj1=null;
			while((obj1=objin.readObject()) instanceof endoffile== false)
			{
				System.out.println(((employee)obj1).name+((employee)obj1).empid+((employee)obj1).address+((employee)obj1).phnnumber);
			}
			objin.close();
			fin.close();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}

class employee implements Serializable
{
	String name;
	String empid;
	String address;
	String phnnumber;
	public employee(String n1,String emp1,String add1,String pno1)
	{
		super();
		this.name=n1;
		this.empid=emp1;
		this.address=add1;
		this.phnnumber=pno1;
	}
}

class endoffile implements Serializable//this class is used to create an object which would mark the end of file writing
{
	
}