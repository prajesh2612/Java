package exceptionHandlingPractice;
import java.util.Scanner;
public class _2inputMismatchException {

	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int num;
		System.out.println("Enter a number:");
		num=in.nextInt();/*While performing input:
		                   a) If we enter an integer, like we have mentioned here, we'll get our desired output and no error would be
		                      shown at the run time.
		                   b) If instead of an integer, we enter something of different data-type (Eg: string), then an error would be 
		                      displayed and the program would stop executing instantly, that is it would terminate.
		                   c) This kind of error is called Input Mismatch Exception.
		                   d) Along with the error or type of exception, the exact line, class and package of that exception would be
		                      displayed. This is done by the Java Virtual machine or JVM.
		                   e) Here JVM acts as a thrower. 
		                   j) Basically, here the JVM is creating an exception and creating and throwing an object from the class which has
		                      same name as that of exception, eg: Here, JVM is using the class 'InputMismatchException', creating an 
		                      object there and throwing that object.*/
		System.out.println(num);
		in.close();
	}
}
