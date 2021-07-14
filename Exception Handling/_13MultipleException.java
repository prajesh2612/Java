package exceptionHandlingPractice;
import java.util.Scanner;

public class _13MultipleException
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
		//In order to catch Arithmetic exception object obtained from the try section, we just use to call ArithmeticException class
		catch(ArithmeticException e)//unreachable code 
		{
			System.out.println("Do not put violate arithmetic rules");
		}
				
		/*Once we've called the ArithmeticException class in the program to catch Arithmetic exception, then the Exception class (below),
		  whose responsibility is to catch every kind of exception object thrown by the try section, would not be able to execute if the
		  exception type is arithmetic. This because there is already a catcher: catch(ArithmeticException e)prior to it to do this job.*/
		
		// In order to catch any other kind of exception object obtained from the try section, we just use to call Exception class
		catch(Exception e)
		{
			System.out.println("I would be able to catch any type of exception");
		}		
		System.out.println("If this message is printed, this means that the catch section of either exceptions was succesfully executed");
	}
}


