package exceptionHandlingPractice;
import java.util.InputMismatchException;
import java.util.Scanner;
public class _19throws 
{
	public static void main(String[] args) 
	{
		divisionbyzero d=new divisionbyzero();
		try 
		{
			d.division();/*if the division() method from divisionbyzero class throws the arithmetic kind of exception, then this try
			               section would throw an object of ArithmeticException class to the catch section*/	
		}			
		
		catch( ArithmeticException e)/*The catch section would catch the particular kind of exception thrown by the try section and
		                               display the relevant message*/ 
		{
			System.out.println(e.getMessage());
		}
	}
}

class divisionbyzero//any unknown class
{
	int a;
	int b;
	public divisionbyzero()
	{
		a=10;
		b=0;
	}
	public void division() throws ArithmeticException/*as soon as there is arithmetic exception occurring in this method, 'throws' would
	                                                   throw the ArithmeticException from this method to the main method where this method
	                                                   'division()' is called.*/
	
	{
		System.out.println(a/b);
	}
	public void inputdivision() throws ArithmeticException,InputMismatchException/*as soon as there is arithmetic exception or 
	                                                                               inputmismatch exception occurring in this method,
	                                                                               'throws' would throw the ArithmeticException or from
	                                                                                this method to the main method where this method
	                                                                                'inputdivision()' is called.*/
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		a=Integer.parseInt(in.nextLine());
		b=Integer.parseInt(in.nextLine());
		System.out.println(a/b);
	
	}
}