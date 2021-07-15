package FileHandling;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;

public class _10DataInputStream 
{
	public static void main(String[] args)
	{
		try
		{
			File obj=new File("prajesh4.txt");
			FileInputStream fin=new FileInputStream(obj);
			DataInputStream din=new DataInputStream(fin);//We use this file class to read data of any primitive data type from that file
			int data=din.readInt();//this would read Integer type data from the target file
			String name=din.readUTF();/*this used to read String type data from the target file. The Strings in text file are read by this
			                            method as UTF-8 characters*/
			boolean result=din.readBoolean();//this would read Boolean type data from the target file
			
			//We'll first write these data in the DataOutputStream
			System.out.println(data);
			System.out.println(name);
			System.out.println(result);
			
			din.close();
			fin.close();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
