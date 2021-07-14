package exceptionHandlingPractice;
import java.util.Scanner;

public class _12MultipleExceptions
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
		//In order to catch any kind of exception object obtained from the try section, we just use to call Exception class
		catch(Exception e)
		{
			System.out.println("I would be able to catch any type of exception");
		}
		
		/*Once we've called the Exception class in the program to catch any kind of exception, then it would be useless to call any 
		  other exception class or the subclasses of the Exception class, like here we tried to call the ArithmeticException class to
		  catch the Arithmetic exception object thrown by the try section. This resulted in error, because there was already a catcher
		  prior to it. */
		
		/*catch(ArithmeticException e)//unreachable code 
		{
			System.out.println("Do not put violate arithmetic rules");
		}*/
		System.out.println("If this message is printed, this means that the catch section of either exceptions was succesfully executed");
	}

}
