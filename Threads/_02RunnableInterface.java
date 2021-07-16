package Threads;

//here we will look how to create threads using Runnable interface 
/*When we implement Interface Runnable, it is mandatory to give the definition of run() abstract method int the class which extends
  this extention. */
class test implements Runnable
{
	public void run()
	{
		System.out.println("I am from thread1");
	}
}

//we can have other classes too which implements runnable
class prajesh implements Runnable
{
	public void run()
	{
		System.out.println("I am from thread2");
	}
}

public class _02RunnableInterface
{
	public static void main(String[] args)
	{
		//Here we'll create a Thread for the class 'test' (which implements Runnable)
		test t=new test();//object of type test
		Thread tr1=new Thread(t);/*:object of type Thread.
		                         :Thread is a pre-defined class in JAVA.
		                         :To one of the constructors of class Thread, the object (t) of class 'test' (which implements Runnable)
		                          is passed.*/
		tr1.start();//This would invoke the run method in the 'test' class
		
		
		//Here we'll create another Thread for the new class 'prajesh' (which implements Runnable)
		prajesh pr=new prajesh();//object of type prajesh
		Thread tr2=new Thread(pr);/*:object of type Thread.
		                         :Thread is a pre-defined class in JAVA.
		                         :To one of the constructors of class Thread, the object (pr) of class 'prajesh' (which implements
		                          Runnable) is passed.*/
		tr2.start();//This would invoke the run method in the 'prajesh' class
		
		System.out.println("hi! I'm from method");
		
		/*Here: tr1.start() and tr2.start() would invoke the run() method in both the classes (test and prajesh), simultaneously.
		 *    : on execution, we'll see that these three threads: tr1, tr2 and main thread won't execute in a sequential order, instead
		        they would execute in a random order based on the thread scheduler assigning the resources to execute the Thread.*/		
	}
}
