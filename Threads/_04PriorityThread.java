package Threads;

public class _04PriorityThread
{
	public static void main(String[] args)
	{
		/*Here we'll do the same example as we did in the previous program, in order to get the priority of a thread which is assigned by
		  the Thread scheduler*/
		Thread thr1=new Thread(new Runnable() {		      
				public void run()
				{
					System.out.println("The priority of Thread 1 assigned by the Thread Scheduler: "+Thread.currentThread().getPriority());
					//Here the priority of the Thread thr1, which is been assigned by the Thread scheduler, would be display.
				}
		});			
		thr1.start();
		
		Thread thr2=new Thread(new Runnable() {	
			public void run() 
			{
				
				System.out.println("The priority of Thread 2 assigned by the Thread Scheduler: "+Thread.currentThread().getPriority());
				//Here the priority of the Thread thr2, which is been assigned by the Thread scheduler, would be display.
			}
		});
		thr2.start();
		
		System.out.println("The priority of Thread main assigned by the Thread Scheduler: "+Thread.currentThread().getPriority());
		//Here the priority of the Thread main, which is been assigned by the Thread scheduler, would be display.
		
		/*:On execution, we'll see that all the threads have been assigned same priority by the thread scheduler.
		 * :Hence, now the order of execution of these threads would depend on their order of arrival. 
		 * :Since we can see that the order is: thr1-->thr2-->main. Hence, these threads would execute in this order.*/
	}
}
