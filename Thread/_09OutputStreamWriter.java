package FileHandling;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class _09OutputStreamWriter
{
	public static void main(String[] args)
	{
		try
		{
			/*FileReader class is used to read characters in the file. It takes the default encoding standard of the system
			 (for windows:Cp1252)*/
			FileOutputStream fout=new FileOutputStream("prajesh3.txt");//would write the text as 1 byte (Standard ANSI code)
			OutputStreamWriter iwrite=new OutputStreamWriter(fout);//would write the text in UTF-16 standard or 16 bits or 2 Bytes
			iwrite.write(26968);/*:write() is an integer type method in class OuputStreamReader which is used to read 2 bytes to the 
			                       file. Here the corresponding 2byte character of the UTF-16 code, sent in the argument of the method
			                       write(), is written on the target file (here: prajesh3.txt)
			                       
			                       *:in order to do this, modify the run configuration of the current program to UTF-16.
			                       *:also change the character encoding of the target file to UTF-16*/
			System.out.println("Successfully written the data");
			iwrite.close();	
			fout.close();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
    }
}
