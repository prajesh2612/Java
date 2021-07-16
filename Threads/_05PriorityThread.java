package Threads;

public class _05PriorityThread 
{
	public static void main(String[] args)
	{
		/*Here we'll do the same example as we did in the previous program, in order to set the priory of a thread which is assigned by
		  the user himself*/
		Thread thr1=new Thread(new Runnable() {		      
				public void run()
				{
					Thread.currentThread().setPriority(10);/*:In the argument of the method setPriority(<priority>) is setting the priority
					                                         of the thread.
					                                        :Here the user is setting the priority of Thread thr1 as 10.*/
					System.out.println("The priority of Thread 1 assigned by the Thread Scheduler: "+Thread.currentThread().getPriority());
					//Here the priority of the Thread thr1, which is been assigned by the user himself, would be display.
				}
		});			
		thr1.start();
		
		Thread thr2=new Thread(new Runnable() {	
			public void run() 
			{
				Thread.currentThread().setPriority(1);/*Here the the user is setting the priority of Thread thr2 as 1.*/
				System.out.println("The priority of Thread 2 assigned by the Thread Scheduler: "+Thread.currentThread().getPriority());
				//Here the priority of the Thread thr2, which is been assigned by the user himself, would be display.
			}
		});
		thr2.start();
		
		Thread.currentThread().setPriority(5);/*Here the user is setting the priority of Thread main as 5.*/
		System.out.println("The priority of Thread main assigned by the Thread Scheduler: "+Thread.currentThread().getPriority());
		//Here the priority of the Thread main, which is been assigned by the user himself, would be display.
		
		/*:On execution, we'll see that the threads are been executing in the descending order of priority assigned to it by the user.
		 *:Hence, the thread with greater priority would be executed first and the thread with smaller priority would be executed 
		    afterwards. 
		 * :Since we can see that the priority of: thr1 Thread(=10)>main Thread(=5)>thr2 Thread(=1)
		    Therefore the order of execution is: thr1-->main-->thr2. Hence, these threads would execute in this order.*/
	}

}
