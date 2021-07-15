package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class _08InputStreamReader
{
	public static void main(String[] args) 
	{
		try
		{
			/*FileReader class is used to read characters in the file. It takes the default encoding standard of the system
			 (for windows:Cp1252)*/
			File obj=new File("prajesh.txt");//object of text file which we will read
			FileInputStream fin=new FileInputStream(obj);//would read the text as 1 byte (Standard ANSI code)
			InputStreamReader iread=new InputStreamReader(fin,"UTF-16");//would read the text in UTF-16 standard or 16 bits or 2 Bytes
			int data=iread.read();//read() is an integer type method in class InputStreamReader which is used to read 2 bytes from the file
			System.out.println(data);/*Since the content of the file 'prajesh.txt' is: hello, hence on reading only one byte of the input
                                       file, InputStreamReader would read only 'h' and would display it asUTF-16 code of that byte.
                                       Here: UTF-16 code of 'h' is 26725, whose binary equivalent is 1 byte or 8 bits*/
			System.out.println((char)data);/*Would print the corresponding UTF-16 character (only on modifying the run configuration of 
			                                 the IDE to UTF-16)*/
			iread.close();
			fin.close();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
    }
}
