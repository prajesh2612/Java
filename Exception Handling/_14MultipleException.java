package exceptionHandlingPractice;
import java.util.InputMismatchException;
import java.util.Scanner;
public class _14MultipleException
{
	public static void main(String[] args)
	{
		try
		{
			Scanner in=new Scanner(System.in);
			int num1,num2;
			System.out.println("Enter the two numbers:");
			num1=in.nextInt();//Here input mismatch exception can take place
			num2=in.nextInt();
			System.out.println(num1/num2);//here arithmetic exception can take place
			in.close();
		}
		catch(Exception e)
		{
			System.out.println("I would be able to catch any type of exception");/*irrespective of the kind of an exception, 
			                                                                       this message would be printed*/
			
			/*If we want to know what kind of exception from the try section, has the catch section (calling the Exception superclass)
			  has caught, we'll use the 'instanceof' keyword here*/
			if(e instanceof ArithmeticException)//would execute in case of Arithmetic Exception
			{
				System.out.println("It is arithmetic exception");
			}
			else if(e instanceof InputMismatchException)//would execute in case of Input mismatch Exception
			{
				System.out.println("It is input mismatch exception");
			}
			else//would execute if the kind caught exception isn't identifiable by the catch section
			{
				System.out.println("Exception is not identifiable");
			}
		}
	}
}
