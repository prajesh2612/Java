package exceptionHandlingPractice;
import java.util.InputMismatchException;
import java.util.Scanner;

public class _22finally
{
	public static void main(String[] args) 
	{
		divisionbyzero1 d=new divisionbyzero1();
		try 
		{
			d.inputdivision();		
		}		
		catch( Exception e)
		{
			System.out.println("All exceptions are caught");
		}
		
		finally/*: this is used with try-catch, that is in exception handling
		         : it is used in case the code connected to a database, suffers with various exceptions, then it is necessary to close 
		           all the databases connected to that code so that other codes/processes can access that database
		         : hence, final keyword does that for us.
		         : hence, even if the exception occurs or not, the finally keyword would release all the databases (or files)*/
		{
			System.out.println("All the databases are closed");			
		}
	}
}

class divisionbyzero3//any unknown class
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