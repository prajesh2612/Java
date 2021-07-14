package exceptionHandlingPractice;
import java.util.InputMismatchException;
import java.util.Scanner;
public class _21throws 
{
	public static void main(String[] args) 
	{
		divisionbyzero2 d=new divisionbyzero2();
		try 
		{
			d.division();/*if the () method from divisionbyzero class throws the arithmetic or inputmismatch kind of exception, then this
			                try section would throw an object of ArithmeticException class or InputMismatch class to the catch section*/
		}
		
		/*depending upon the types of exceptions, thrown by the division() method, we'll have to write a catch section for that kind
		  of exception.
		  
		  *Here we are forming catch section for two types of exceptions: Arithmetic and InputMismatch types of exceptions which are
		   thrown by the division() method of the divisionbyzero class*/
		
		catch( ArithmeticException e)/*The catch section would catch the particular kind of exception (here: Arithmetic exception) thrown
		                               by the try section and display the relevant message*/ 
		{
			System.out.println(e.getMessage());
		}
		
		catch( InputMismatchException e)/*The catch section would catch the particular kind of exception (here: InputMismatch exception) 
		                                  thrown by the try section and display the relevant message*/ 
		{
			System.out.println(e.getMessage());
		}		
	}
}

class divisionbyzero2//any unknown class
{
	int a;
	int b;
	
	//here we are making inputs in the constructors itself
	public divisionbyzero2() 
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		a=in.nextInt();
		b=in.nextInt();
		in.close();
	}
	
	public void division() throws ArithmeticException, InputMismatchException
	{		
		System.out.println(a/b);	
	}	
}

