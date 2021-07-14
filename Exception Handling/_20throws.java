package exceptionHandlingPractice;
import java.util.InputMismatchException;
import java.util.Scanner;
public class _20throws 
{
	public static void main(String[] args) 
	{
		divisionbyzero1 d=new divisionbyzero1();
		try 
		{
			d.inputdivision();/*if the inputdivision() method from divisionbyzero class throws the arithmetic or inputmismatch kind of
			                    exception, then this try section would throw an object of ArithmeticException class or InputMismatch class
			                    to the catch section*/			
		}
		
		/*depending upon the types of exceptions, thrown by the inputdivision() method, we'll have to write a catch section for that kind
		  of exception.
		  
		  *Here we are forming catch section for two types of exceptions: Arithmetic and InputMismatch types of exceptions which are
		   thrown by the inputdivision() method of the divisionbyzero class*/
		
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

class divisionbyzero1//any unknown class
{
	int a;
	int b;

	/*public divisionbyzero()
	{
		a=10;
		b=0;
	}*/
	//if instead of using constructors to put values in a & b, we take user inputs from a & b
	public void inputdivision() throws ArithmeticException,InputMismatchException/*as soon as there is arithmetic exception or 
	                                                                               inputmismatch exception occurring in this method,
	                                                                               'throws' would throw the ArithmeticException or from
	                                                                                this method to the main method where this method
	                                                                                'inputdivision()' is called.
	                                                                               
	                                                                               *this we do in the case of multiple exceptions which
	                                                                                might possibly occur in a method*/
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		a=in.nextInt();
		b=in.nextInt();
		System.out.println(a/b);
		in.close();	
	}	
}

