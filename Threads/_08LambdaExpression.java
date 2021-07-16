package Threads;
/*: Here we are going to use the concept of lambda expression.
 *: Like we used anonymous class to reduce the size of a program, in the previous program
 *: In the same way we'll use the Lambda expression to reduce the program more.
 *: But Lambda expressions can only be used in case of FUNCTIONAL INTERFACE.
 *: Functional Interfaces are those interface which consists of only one method.*/

//lets take an example of an functional interface
interface employee2 
{
	public void display();/*:this method is only used to display messages
	                        :this method does not take any parameters*/
}

//lets take another functional interface which takes one parameter
interface employee3
{
	public void display1(String name);/*:this method is used to display messages
                                        :this method takes one parameter*/
}

//lets take another functional interface which takes multiple parameters
interface employee4
{
	public void display2(String name1,int age,String designation );/*:this method is used to display messages
                                                                     :this method takes multiple (here: 3) parameters*/
}

//lets take another functional interface which takes 2 parameters for arithmetic operations
interface arithmetic1
{
	public int addition(int a,int b);/*:this method is used to perform arithmetic operations (here: addition)
                                       :this method takes multiple (here: 2) parameters*/
}

interface test2
{
	public void concate(String a[]);
}




public class _08LambdaExpression
{
	public static void main(String[] args)
	{
		//For functional interface with no parameters
		employee2 e2=()->{System.out.println("This is from the functional interface which takes no parameter");};/*:Within the same line of
		                                                                                                            object creation of the
		                                                                                                            functional interface,
		                                                                                                            we'll display the 
		                                                                                                            message*/
		e2.display();//here we'll call the display() method in the functional interface: 'employee2'
		
		
		//For functional interface with one parameter
		employee3 e3=(name)->{System.out.println("The name in the functional interface with one parameter is:"+name);};
		e3.display1("Prajesh");/*here we'll send the value to be stored in the parameter of the method display1(String) in functional
		                         interface employee3*/
		
		
		
		//For functional interface with multiple parameters
	    employee4 e4=(name1,age,designation)->{System.out.println("The name, age and designation in the functional interface with mutliple (here:3) parameters is:"+name1+" "+age+" "+designation);};
		e4.display2("Prajesh",21,"Student");/*here we'll send the value to be stored in each of the corresponding parameters of the
				                                      method display2(String,int,String) in functional interface employee3*/

		
		//For performing arithmetic operations
		arithmetic1 a1=(a,b)->{return (a+b);};
		int result=a1.addition(3,2);/*:here we are sending the values to be stored in each of the corresponding parameters of the method
		                               addition(int,int)
		                              :this method would perform a+b arithmetic operation and the result would be returned
		                              :the returned result would be stored in the variable 'result'*/
		System.out.println("Result="+result);
		
		
	   //For threads, just simply call the Runnable interface by creating an object of Thread class
		Runnable r1=()->{System.out.println("I am from Thread 1");};
		Thread tr1=new Thread(r1);//here we are creating an object of Thread class
		tr1.start();//this would invoke the run() class in the Runnable interface	
		
		
		test2 t2=(a)->{int i; String s="";
		               for(i=0;i<4;i++)
		            	   {		            	   
		            	   s=s+a[i];
		            	   System.out.println(s);
		            	   }
		            	   };
		  String c[]= {"One","Two","Three","Four"};
		  t2.concate(c);
		
		  
		
		
	}
}
