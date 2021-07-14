package exceptionHandlingPractice;
import java.util.InputMismatchException;
import java.util.Scanner;

public class _24nestedtrycatch
{
	public static void main(String[] args) 
	{
		divisionbyzero5 d=new divisionbyzero5();
		try/*this outer exception would exceptions other than Arithmetic kind of exceptions (here: InputMismatch type)*/
		{
			try/*this nested try-catch section would catch only those exceptions which are of Arithmetic kind, thrown by the method 
			     inputdivision() in class divisionbyzero via object: 'd'.
			     : in this nested try section, instead of catch section, we have finally section.
			     : Hence, when this nested try section couldn't find a corresponding nested catch section, it would go outside the nested 
			       and access or throw its exception object to the outer catch section.*/
			{
				d.inputdivision();					
			}
			finally/*irrespective of any kind of exception which might satisfy the outer or the nested try section final section would
			         always be displayed*/
			{
				System.out.println("All databases are released");
			}
		}
		catch(Exception e)
		{
			System.out.println("All kinds of exceptions are caught");
		}
	}
}

class divisionbyzero5//any unknown class
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