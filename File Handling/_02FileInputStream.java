package FileHandling;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class _02FileInputStream 
{
	public static void main(String[] args) throws IOException 
	{
		try//Always use try-catch exception handling in case of file handling
		{
			//we use this class to read 8bits or 1byte of data from a file
			File obj=new File("prajesh.txt");//first we'll create an object for the file which we are going to write
			FileInputStream fin=new FileInputStream(obj);/*here we are creating an instance of the FileInputStream class for file object
			                                                 'obj' of "prajesh.txt" text file.*/
			int data=fin.read();//read() is an integer type method in class FileInputStream which is used to read 1 byte from the file
		    System.out.println(data);/*Since the content of the file 'prajesh.txt' is: hello, hence on reading only one byte of the input
			                           file, InputStreamReader would read only 'h' and would display it as ANSI code of that byte.
			                           Here: ANSI code of 'h' is 104, whose binary equivalent is 1 byte or 8 bits*/
			
		   System.out.println((char)data);/*this would display the character equivalent of the ASCII code which we have acquired in 
			                                 previous step. Here: Since we got 104 in previous step, hence here we'll get it's character
			                                 equivalent, that is: 'h'*/			
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();;			
		}
	}
}
