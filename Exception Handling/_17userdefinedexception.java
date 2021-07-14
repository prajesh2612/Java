package exceptionHandlingPractice;
import java.util.Scanner;
public class _17userdefinedexception
{
	public static void main(String[] args)
	{
		try
		{
			Scanner in=new Scanner(System.in);
			int num1,num2;
			System.out.println("Enter the two numbers:");
			num1=in.nextInt();
			num2=in.nextInt();
			if(num2==13)/*: here we'll create an exception condition of our own type of exception which is been defined by the user in the 
			                user defined exception class: 'prajeshexception'*/
			{
				throw new prajeshexception("The number is not allowed");/*This object of exception class 'prajeshexception, is thrown by
				                                                             try section for the catch section to catch.*/
			}
			System.out.println(num1/num2);
			in.close();
		}
		catch(prajeshexception e)/*:This section, 'catch' would catch the exception objects of class 'prajeshexception' thrown by the try
		                            section.
		                           : This section would call the class prajeshexception and display the message related to that exception*/
		{
			System.out.println(e.getMessage());/*Here we are overriding the default message stored in the getMessage method of the super
			                                     class 'Exception', of the user defined exception class 'prajeshexception' */ 
		}
	}
}
class prajeshexception extends Exception/*this class is used to define the exception of type 'prajeshexception' which by default should be
                                          inheriting the class 'Exception'*/ 
{
	prajeshexception(String s)
	{
		super(s);//here we are calling the super class: Exception in order to call the method getMessage() in the super class
	}
}
