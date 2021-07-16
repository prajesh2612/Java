package Threads;

import java.io.File;
import java.io.FileOutputStream;

public class _00Intro 
{
	public static void main(String[] args)
	{
		try
		{
			File obj=new File("File1.txt");
			FileOutputStream fout=new FileOutputStream(obj);
			byte a[]=new byte[100];
			int i;
			for(i=0;i<100;i++)
			{
				a[i]=(byte)i;
			}
			fout.write(a);
			fout.close();
			
			File obj1=new File("File2.txt");
			FileOutputStream fout1=new FileOutputStream(obj1);
			byte b[]=new byte[100];
			for(i=0;i<100;i++)
			{
				b[i]=(byte)(i+101);
			}
			fout1.write(b);
			fout1.close();
			
			/*:Here File1 is written first, then File2 is written.
			 *:This means that File2 waits for File1 to get written first.
			 *:This takes too much system time.
			 *
			 *:What we actually need here is that we want both the files to get written simultaneously.
			 *:In general terms, we want both the paths (or program) to run parallel (or concurrently)
			 *:Hence in order to write both the files simultaneously, we'll use the concept of Threads*/
			System.out.println("The File write is successful");//this line would get displayed if both the files are successfully written
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
