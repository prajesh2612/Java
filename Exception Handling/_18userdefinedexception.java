package exceptionHandlingPractice;
import java.util.Scanner;
public class _18userdefinedexception
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
			if(num2==13)/*: here we'll create an exception condition of our own type of exception which is been defined by the user in the 
			                user defined exception class: 'num13exception'*/
			{
				throw new num13exception("The number 13 is not allowed");
			}
			
			else if(num2==15)/*: here we'll create an exception condition of our own type of exception which is been defined by the user 
			                     in the user defined exception class: 'num15exception'*/
			{
				throw new num15exception("The number 15 is not allowed");
			}			
			
			System.out.println(num1/num2);
			in.close();
		}
		catch(prajeshexception1 e)
		{
			System.out.println(e.getMessage());
		}
	}
}

class prajeshexception1 extends Exception
{
	prajeshexception1(String s)
	{
		super(s);
	}
}
/*: Here mainly we perform inheritance in user defined exception.
  : This help is specifying the type of exception the user defined superclass of exception is trying to denote.*/

class num13exception extends prajeshexception1/*: This exception class inherits the user defined exception class 'prajeshexception'*/
{
	num13exception(String s)
	{
		super(s);
	}
}
class num15exception extends prajeshexception1/*: This exception class inherits the user defined exception class 'prajeshexception'*/
{
	num15exception(String s)
	{
		super(s);
	}
}


