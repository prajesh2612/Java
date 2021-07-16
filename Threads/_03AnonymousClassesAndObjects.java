package Threads;

/*:In the previous program we saw that in order to create a Thread using Runnable interface and execute the run() method, we had to follow 
   these 3 steps:
   Step 1: creating a class which implements Runnable.
   Step 2: Creating the object of that class which implements Runnable.
   Step 3: Creating an object of class Thread which is used to invoke the run() method in the class (which implements Thread) using start() 
           method.
   
   *: Like we can see that only to execute run() method, we have to follow these three steps.
   *: In order to avoid beating around the bush like this, we'll use the concept of : "Anonymous Classes and Object".
   *: In this concept, we will skip the step where we have to create a class which extends Runnable (i.e. skip Step 1)
   **/
public class _03AnonymousClassesAndObjects 
{
	public static void main(String[] args)
	{
		//Here we'll do the same example as we did in the previous program, but here we'll use the concept of Anonymous class
		//Here we'll create an object of Thread type directly
		Thread thr1=new Thread(new Runnable() {		      /*: Here: in the parameter, we are having an Anonymous inner class object.
		                                                    : a class is getting defined with a run() method but that class is without a
		                                                      name and object of this Anonymous inner class is created.
		                                                    : By creating this class we are avoiding creating a separate class which 
		                                                      implements Runnable (Step 1 is skipped), also we are avoiding creating an 
		                                                      object of this class (Step 2 is skipped).
		                                                    : Over concept is same, only difference is that instead of creating a new 
		                                                      class every time, we'll just create an anonymous class.*/
				public void run()
				{
					System.out.println("I am from Thread 1");
				}
		});			
		thr1.start();//this would invoke the run() method in the anonymous inner class of thr1 object of Thread class. 
		
		
		//Similarly for the another thread object
		Thread thr2=new Thread(new Runnable() {	
			public void run() 
			{
				System.out.println("I am from Thread 2");
			}
		});
		thr2.start();//this would invoke the run() method in the anonymous inner class of thr2 object of Thread class.
		
		System.out.println("I'm from main method");
		
		/*The order of execution of these threads is on the basis of the priority assigned to it (mainly by thread scheduler, by default or
		  the programmer himself).
		  The execution would follow the concept of priority scheduling. We'll discuss about this in the next program.*/
	}

}
