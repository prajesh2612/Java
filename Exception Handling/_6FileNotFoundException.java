package exceptionHandlingPractice;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class _6FileNotFoundException 
{
	public static void main(String[] args) throws FileNotFoundException
	{
		File test=new File("test.txt");//Here we are trying to access a text file named 'test'.
		Scanner in=new Scanner(test);/*a) Here we are trying to read the 'test' text file.
		                               b) But the thing is that, there is no file named 'test' that currently exists in the system.
		                                  Hence an error would occur because here we are trying to access a non-existent file.
		                               c) This kind of error is known as File Not Found Exception.*/
		String line=in.nextLine();//Here we are trying to read a line from the text file 'test'
		System.out.println(line);//here we are trying to display that line
		in.close();	
	}
}
