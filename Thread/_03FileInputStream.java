package FileHandling;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class _03FileInputStream 
{
	public static void main(String[] args) throws IOException 
	{
		try//Always use try-catch exception handling in case of file handling
		{
			File obj=new File("prajesh.txt");//first we'll create an object for the file which we are going to write
			FileInputStream fin=new FileInputStream(obj);/*here we are creating an instance of the FileInputStream class for file object
			                                                 'obj' of "prajesh.txt" text file.*/
			byte b[]=new byte[5];//this array would store each of the 1 byte ANSI values of first 5 characters in the file prajesh.txt
			fin.read(b);//here the object fin us reading and storing the ANSI values in array b[]
			for(byte k:b)
			{
				System.out.println(k);//display each of the ANSI values read by the object
				System.out.println((char)k);//display corresponding characters of each of the ANSI values read by the object
			}			
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();			
		}
	}
}
