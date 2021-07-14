package exceptionHandlingPractice;
import java.io.*;
public class _3ArithmeticException {

	public static void main(String[] args) throws IOException
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int num1,num2;
		System.out.println("Enter the two numbers:");
		num1=Integer.parseInt(in.readLine());
		num2=Integer.parseInt(in.readLine());
		System.out.println(num1/num2);/*While performing this calculation:
		                               a) If we enter the numbers and perform mathematical operations which follows the rules of
		                                  mathematics, then no error would be shown at the run time.
		                               b) If we instead perform some mathematical operation but we are violating the rules of that
		                                  particular operation, then an error would be displayed. Eg: For division operation, there is a
		                                  rule that we can't divide a number by 0. If we try to do that here, i.e, if we enter num2 as=0,
		                                  then the operation would be in the form: num1/0, which is clearly violating the rules of 
		                                  division. The program would stop executing instantly, that is it would terminate.
                                       c) This kind of error is called Arithmetic Exception.*/
	}
}
