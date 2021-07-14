package exceptionHandlingPractice;
import java.util.Scanner;
public class _9ArithmeticExceptionHandler 
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
			System.out.println("Do not put violate arithmetic rules");
		}
		System.out.println("If this message is printed, this means that the catch section was succesfully executed");
	}
}
