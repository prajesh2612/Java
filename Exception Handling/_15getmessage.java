package exceptionHandlingPractice;

import java.util.Scanner;

public class _15getmessage
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
			System.out.println(num1/num2);
			in.close();
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());/*: we are using object 'e' of class ArithmeticException to access the method getMessage()
			                                     : getMessage() is a method in 'Throwable' class which is the super class of the super 
			                                       class (Exception) of class ArithmeticException.
			                                     : due to inheritance, the class ArithmeticException can access the methods of class
			                                       'Throwable'.
			                                     : This method displays the message related to the type of exception class object calling 
			                                       this method (Eg: Here, the object 'e' of the ArithmeticException class is calling this
			                                                        method)*/
		}
		System.out.println("If this message is printed, this means that the catch section was succesfully executed");
	}
}
