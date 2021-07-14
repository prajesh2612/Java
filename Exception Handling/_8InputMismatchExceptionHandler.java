package exceptionHandlingPractice;
import java.util.InputMismatchException;
import java.util.Scanner;
public class _8InputMismatchExceptionHandler
{
	public static void main(String[] args)
	{
		/*Here, in order to handle Input Mismatch Exception, we will use the concept of try catch try-catch*/
		try/* a) Within the code, where we know that we'll get an exception of a particular type (here: Input Mismatch Exception), we'll
		         put that part of code within the try section.
		      b) Here what actually happens is that, when a particular type of exception occurs, the try would send an object to the catch
		         section of THAT kind of exception (here: Input Mismatch Exception) and display relevant message or perform relevant tasks
		       */
		{
			Scanner in=new Scanner(System.in);
			int num;
			System.out.println("Enter a number:");
			num=in.nextInt();//Here input mismatch may occur, depend on the input choice of the user
			System.out.println(num);
			in.close();
		}
		catch(InputMismatchException e)/*As soon as the exception object of a particular type is sent by try, the catch section of that
		                                 particular type, would recognize that type of Exception ONLY and display the relevant message */
		{
			System.out.println("Do not put wrong inputs");
		}
		System.out.println("If this message is printed, this means that the catch section was succesfully executed");
	}
}
