package exceptionHandlingPractice;
import java.util.InputMismatchException;
import java.util.Scanner;

public class _23nestedtrycatch
{
	public static void main(String[] args) 
	{
		divisionbyzero4 d=new divisionbyzero4();
		try/*this outer exception would exceptions other than Arithmetic kind of exceptions (here: InputMismatch type)*/
		{
			try/*this nested try-catch section would catch only those exceptions which are of Arithmetic kind, thrown by the method 
			     inputdivision() in class divisionbyzero via object: 'd'.*/
			{
				d.inputdivision();					
			}
			catch(ArithmeticException e)
			{
				System.out.println("Arithmetic exception caught");
			}
		}
		catch(Exception e)
		{
			System.out.println("All kinds of exceptions are caught");
		}
	}
}

class divisionbyzero4//any unknown class
{
	int a;
	int b;

	public void inputdivision() throws ArithmeticException,InputMismatchException
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		a=in.nextInt();
		b=in.nextInt();
		System.out.println(a/b);
		in.close();	
	}	
}