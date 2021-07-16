package Threads;

import java.io.File;
import java.io.FileOutputStream;

public class _01intro
{
	/*::In the previous program as we saw that we wanted to execute or write both the files simultaneously to save time.
	 * :In general, we want to run different path parallely rather than sequentially.
	 * :This would be obtained if we make an independent path of execution for each block (like in previous program, writing to File1 was 
	    one block, while writing to File2 was another block within the program.
	 * 
	 * :These independent paths of execution in a program can be achieved by using "Threads".
	 * :Thread is a class in JAVA.
	 * :Whenever we'll use Threads, we'll extend this class and override the run() method which is within this class
	 * :Many Threads can run concurrently within a program.
	 * :All JAVA programs have at least one Thread, known as 'main' Thread. It is created when main() method is invoked.:*/
	
	/*Demonstration of previous program using the concept of Threads (Skip the main method. First have a look at the two Thread classes 
	  below, after going through the Thread classes, come back to the main method)*/
	
	public static void main(String[] args)
	{
		//Creating the object for each Thread class for writing a text file
		writefile1 w1=new writefile1();
		writefile2 w2=new writefile2();
		
		w1.start();/*Instead of w1.run(), we will write w1.start() to invoke the run() method in the inherited class of the Thread class*/
		w2.start();
		
		System.out.println("Main Method is over");
		
		/*:On running this program we'll see that both the classes would run simultaneously, i.e, writing of File1 and File2 would take 
		   place simultaneously.
		 *:We'll not come across the case which happened in previous program.
		 *:Since main() method is also a thread, hence first this Thread would execute then the other thread classes would execute 
		   concurrently.*/
	}
	 
}	

//For File1
class writefile1 extends Thread
{
	public void run()//here we are overriding run() method in Thread class
	{
		try
		{
			File obj=new File("File1.txt");
			FileOutputStream fout=new FileOutputStream(obj);
			byte a[]=new byte[100];
			int i;
			for(i=0;i<100;i++)
			{
				System.out.println("File1 write");
				a[i]=(byte)i;
			}
			fout.write(a);
			fout.close();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}

//For File2
class writefile2 extends Thread
{
	public void run()//here we are overriding run() method in Thread class
	{
		try
		{
			File obj1=new File("File2.txt");
			FileOutputStream fout1=new FileOutputStream(obj1);
			byte b[]=new byte[100];
			int i;
			for(i=0;i<100;i++)
			{
				System.out.println("File2 write");
				b[i]=(byte)(i+101);
			}
			fout1.write(b);
			fout1.close();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}

