package exceptionHandlingPractice;
import java.util.Scanner;

public class _10MultipleExceptions 
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
		/*If while execution, the Arithmetic Exception occurs then the catch section of ArithmeticException would successfully be
		  executed. But if other exception happens (here, InputMismatchException in the try section, then the catch section would not 
		  be executed and the JVM itself would display the type of exception.
		  
		  *In the upcoming programs you'd get the solution of this problem*/ 
		catch(ArithmeticException e)
		{
			System.out.println("Do not put violate arithmetic rules");
		}
		System.out.println("If this message is printed, this means that the catch section was succesfully executed");
	}
}
