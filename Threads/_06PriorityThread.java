package Threads;

public class _06PriorityThread
{
		/*Here we'll do the same example as we did in the previous program, in order to use join() method for Threads*/
	public static void main(String[] args) throws InterruptedException
	{
		Thread thr1=new Thread(new Runnable() {		      
				public void run()
				{
					System.out.println("The priority of Thread 1 assigned by the Thread Scheduler: "+Thread.currentThread().getPriority());
					//Here the priority of the Thread thr1, which is been assigned by the Thread scheduler, would be display.
				}
		});			
		thr1.start();
		thr1.join();/*join() method with a thread ensures that irrespective of the priority assigned to a thread, the control would get
		             preempted to the another thread only when this thread has finished its execution.*/
		
		Thread thr2=new Thread(new Runnable() {	
			public void run() 
			{
				
				System.out.println("The priority of Thread 2 assigned by the Thread Scheduler: "+Thread.currentThread().getPriority());
				//Here the priority of the Thread thr2, which is been assigned by the Thread scheduler, would be display.
			}
		});
		thr2.start();
		thr2.join();
		
		System.out.println("The priority of Thread main assigned by the Thread Scheduler: "+Thread.currentThread().getPriority());
		//Here the priority of the Thread main, which is been assigned by the Thread scheduler, would be display.
		
	}

}
