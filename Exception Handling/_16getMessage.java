package exceptionHandlingPractice;

import java.util.Scanner;

public class _16getMessage
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
			if(num2==0)/*:As in the previous problem we have discussed how we can obtain a message regarding an exception in the catch
			              section by calling the getMessage() method using the object type of the class of that particular exception.
			             :What here we did is that, we override that method and created our own message by throwing a new object of class
			              ArithmeticException. 
			             :But the method would be overridden only when the condition of forming a throwable object of that exception class
			              is true (here, when num2==0, only then we'll be able to override, else in other cases of arithmetic exception,
			              we won't be able to override the e.getMessage() call.*/
			{
				throw new ArithmeticException("This is my new overidden message");
			}
			System.out.println(num1/num2);
			in.close();
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("If this message is printed, this means that the catch section was succesfully executed");
	}
}
