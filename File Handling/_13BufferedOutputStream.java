package FileHandling;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class _13BufferedOutputStream 
{
	public static void main(String[] args)
	{
		try
		{
			FileOutputStream fout=new FileOutputStream("prajesh5.txt");
			BufferedOutputStream dout=new BufferedOutputStream(fout);
			dout.write(105);/*in the file, the corresponding character of the argument of the method write(<arg>) would be written.
                               Eg: if the arg=105, then the corresponding character of ANSI character would be written, i.e., 'i'.*/
			
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
