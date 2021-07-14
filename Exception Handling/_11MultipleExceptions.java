package exceptionHandlingPractice;
import java.util.InputMismatchException;
import java.util.Scanner;
public class _11MultipleExceptions
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
		  executed.*/
		catch(ArithmeticException e)
		{
			System.out.println("Do not put violate arithmetic rules");
		}
		/*If while execution, the InputMisMatch Exception occurs then the catch section of  InputMisMatchException would successfully
		  be executed.*/
		catch(InputMismatchException e) 
		{
			System.out.println("Do not put wrong inputs");
		}
		System.out.println("If this message is printed, this means that the catch section of either exceptions was succesfully executed");
	}

}
