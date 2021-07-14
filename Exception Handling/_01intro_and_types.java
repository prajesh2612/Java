package exceptionHandlingPractice;
public class _01intro_and_types 
{
	//INTRO
	/*exceptions is anything that does not follow a rule and does not behave in an expected way
	 * -in programs, any problem can occur during the execution of a program.
	 * -your program can encounter abnormal situations during runtime.
	 * -the problem can occur infrequently 
	   -here we'll try to separate main-stream activities from the error handling process*/
	
	//TYPES
	/*1. Input Mismatch Exception
	     This kind of exception occurs when the case of input in the execution engine is different from that which is been
	     mentioned in the program. Eg: If in program we have mentioned that we have to enter 2 numbers but in the execution
	                                   engine we are entering a number then we are entering a string (or any other data type,
	                                   except integer), this would result in error or problem called Input Mismatch Exception*/
	
	/*2. Arithmetic Exception
         This kind of exception occurs when we try to perform undefined mathematics calculations which is against the rules of 
         mathematics. Eg: If in program we have mentioned that we have to enter 2 numbers and divide the first number by the
                          second number. But in the execution engine we are entering the first number as a normal integer but
                          the second number as this would result in error or problem because, 4/0 is not defined in mathematics.
                          Hence this is called Arithmetic Exception*/
	
	/*3. Index Out of bound Exception
         This kind of exception occurs when we try to add or access and array element using the the index which is beyond the 
         limit of the array length. Eg: If in program we have mentioned that we have initialized the size of the array as 3. But 
                                        in the execution engine we are trying to access 4th or 5th element of the array, using 
                                        indices 3 and 4 respectively, we'll get an error, because the allowed limit of indices
                                        in this array is from 0 to 2. Hence this is called Out of Bound Exception*/
	
	/*4. Null pointer Exception
         This kind of exception occurs when we try to add or access and array element using the the index which is beyond the 
         limit of the array length. Eg: If in program we have mentioned that we have initialized the size of the array as 3. But 
                                        in the execution engine we are trying to access 4th or 5th element of the array, using 
                                        indices 3 and 4 respectively, we'll get an error, because the allowed limit of indices
                                        in this array is from 0 to 2. Hence this is called Out of Bound Exception*/
	
	

}



