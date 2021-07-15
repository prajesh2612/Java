package FileHandling;

import java.io.File;
import java.io.FileOutputStream;

public class _05FileOutputStream
{
	public static void main(String[] args) 
	{
		try
		{
			File obj=new File("prajesh1.txt");
			//we use this class to write 8bits or 1byte of data to a file
			FileOutputStream fout=new FileOutputStream(obj);/*here we are creating an object of class FileOutputStream into whose
			                                                  constructor we'll sent the object obj of the text file where we are going
			                                                  to write*/ 
			fout.write(104);/*in the file, the corresponding character of the argument of the method write(<arg>) would be written.
			                  Eg: if the arg=104, then the corresponding character of ANSI value would be written, i.e., 'h'.*/
			fout.close();/*here we'll close the fout object*/
			
			FileOutputStream fout1=new FileOutputStream("prajesh1.txt",true);/*here we have created another object of class 
			                                                                   FileOutputStream into whose another constructor (overloaded
			                                                                   constructor) we'll not only send the file's name but also
			                                                                   boolean value 'true' in order to append more data into that
			                                                                   file*/
			fout1.write(105);/*in the file the corresponding character of the argument ANSI code would be written*/
			fout1.close();
			
			FileOutputStream fout2=new FileOutputStream("prajesh1.txt",true);/*here we are doing the same thing as we did in the previous
			                                                                   step*/
			byte b[]={104,55,123,121};
			fout2.write(b);/*this would append the corresponding character of each 1byte ANSI code in the given byte type array, to the
			                 already existing matter in the text file*/ 
			fout2.close();
			
			FileOutputStream fout3=new FileOutputStream("prajesh1.txt",true);/*here we are doing the same thing as we did in the previous
                                                                               step*/
			byte c[]={104,55,123,121};
			fout3.write(c,0,2);/*:this would append the corresponding character of each 1byte ANSI code in the given byte type array whose
			                      index position is ranging from 0 to (2-1)=1, to the already existing matter in the text file.
			                     :here, 0 is called the offset and 2 is called the length.*/
			fout3.close();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
