package FileHandling;

import java.io.BufferedInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class _12BufferedInputStream 
{
	public static void main(String[] args)
	{
		try
		{
			//BufferedInputStream is used for better performance
			File obj=new File("prajesh5.txt");
			FileInputStream fout=new FileInputStream(obj);
			BufferedInputStream bin=new BufferedInputStream(fout);
			int data=bin.read();//read() is an integer type method in class FileInputStream which is used to read 1 byte from the file
		   
			
			//We'll first write these data in the DataOutputStream
			 System.out.println(data);/*Since the content of the file 'prajesh5.txt' is: "i" hence on reading only one byte of the input
	                                   file, BufferedInputStream would read only 'i' and would display it as ANSI code of that byte.
	                                   Here: ANSI code of 'i' is 105, whose binary equivalent is 1 byte or 8 bits*/
			 System.out.println((char)data);//would print the corresponding character of the ANSI code displayed above
			
			bin.close();
			fout.close();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
    }
}
