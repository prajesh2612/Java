package FileHandling;
import java.io.FileReader;
public class _06FileReader
{
	public static void main(String[] args) 
	{
		try
		{
			/*FileReader class is used to read characters in the file. It takes the default encoding standard of the system
			 (for windows:Cp1252)*/
			FileReader fread=new FileReader("prajesh.txt");/*here we are creating an object of the FileReader class and as the parameter of
			                                                 the FileReader class we are sending the name of the file.*/
			int data=fread.read();//read() is an integer type method in class FileReader which is used to read 1 byte from the file
			System.out.println(data);/*Since the content of the file 'prajesh.txt' is: hello, hence on reading only one byte of the input
                                       file, InputStreamReader would read only 'h' and would display it as ANSI code of that byte.
                                       Here: ANSI code of 'h' is 104, whose binary equivalent is 1 byte or 8 bits*/
			fread.close();			              
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
