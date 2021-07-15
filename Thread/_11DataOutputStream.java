package FileHandling;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class _11DataOutputStream
{
	public static void main(String[] args)
	{
		try
		{
			FileOutputStream fout=new FileOutputStream("prajesh4.txt");
			DataOutputStream dout=new DataOutputStream(fout);/*We use this file class to write data of any primitive data type on target 
			                                                   file*/
			dout.writeInt(2);//this would write an Integer type data on the target file
			dout.writeUTF("Prajesh");/*this used to write a String type data on the target file. The Strings in text file are written by
			                          this method as UTF-8 characters*/
			dout.writeBoolean(true);//this would write Boolean type data on the target file
			
			System.out.println("The writing operation is successful");
			
			dout.close();
			fout.close();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
