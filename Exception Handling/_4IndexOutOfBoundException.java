package exceptionHandlingPractice;
public class _4IndexOutOfBoundException {

	public static void main(String[] args)
	{
		int A[]= {1,2,3};
		System.out.println(A[3]);/*a) Here, while execution, the compiler see that we are trying to access an element using the index
		                              number which is beyond the length of the array.
		                           b) Eg: Here we can see that the size of the array A is= 3( since, only 3 elements are there in the
		                                  array), hence the allowed range of index of the elements of the array is from 0 to 2 (0,1,2).
		                                  But here, we are trying to access the index position 3, which is not in the allowed range. Due
		                                  to this, we'll get an error while execution.
		                           c) This kind of error is known as Array Index Out of Bound Exception.*/
	}
}
