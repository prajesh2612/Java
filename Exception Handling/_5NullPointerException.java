package exceptionHandlingPractice;
public class _5NullPointerException {

	public static void main(String[] args) 
	{
		String s=null;
		System.out.println(s.length());/*a) Here while displaying the output, we'll get an error. This because, we have initialized the
		                                    String s as 'null', that is, there is nothing stored in the memory address where the variable
		                                    s is pointing to. Hence it is impossible to get the length of anything that is 'null'.
		                                    Due to this, we'll get an error.
		                                 b) This kind of error is known as Null pointer Exception.*/
	}

}
