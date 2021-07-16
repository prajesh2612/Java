package Threads;

public class _10Synchronized 
{
	/*: As in the previous program, we came across the problem of unsynchronization, here we'l see how to avoid that problem
	  : Here, although we'll create two threads like we did in the previous one but we won't let these two to run simultaneously.
	  : Instead we'll first let the Thread thr1 to finish its operation, then Thread thr2 would do the same.
	  : In order to achieve this synchronized state, we'll first have to lock the manipulation of the shared variable (here Balance) for
	   the Threads thr1 only.
	  : Then we'll unlock the updated shared variable (here: balance) and the lock it for the Thread thr2 for updation or manipulation*/
	
	public static void main(String[] args) throws InterruptedException
	{
		account1 prajesh=new account1(20000);//object for account class, the balance is initialized
		//This thread object is for one thread process
		Thread thr1=new Thread(new Runnable()
				{
			public void run()//Overriding the run() method in the Runnable interface
			{
				int i;
				for(i=0;i<50;i++)
				{
					try {
						prajesh.withdraw(100);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
				}
			}			
				});
		
		//This thread object is for another thread process
		Thread thr2=new Thread(new Runnable()
		{
	public void run()//Overriding the run() method in the Runnable interface
	{
		int i;
		for(i=0;i<50;i++)
		{
			try {
				prajesh.deposit(100);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}			
		});
		
		//This is for the static synchronized method
		Thread thr3=new Thread(new Runnable() {
			public void run()
			{
				account1.display();//for calling the static method display() we aren't creating any object, we are just referencing it using the class name in which this method is present (here: account1)
			}
		});
		
		
		thr1.start();
		thr2.start();
		thr1.join();
		thr2.join();
		
		System.out.println(prajesh.balance);
		prajesh.display1();
	}

}
class account1 
{
		public int balance;
		public account1(int deposit)
		{
			this.balance=deposit;
		}
		public synchronized void withdraw(int withdraw_amount) throws InterruptedException
		{
			System.out.println("This is withdraw");
			Thread.currentThread();
			Thread.sleep(9000);//The Thread thr1 would lock the shared variable 'balance' for 9000 ms or 9secs during these 9secs,Thread thr2 won't be able to access the shared variable balance.
			this.balance=this.balance-withdraw_amount;
			
		}
		
		
		public void deposit(int deposit_amount) throws InterruptedException
		{
			synchronized(this)//this would synchronize only this block
			{
				System.out.println("This is withdraw");
				Thread.currentThread();
				Thread.sleep(9000);//The Thread thr2 would lock the shared variable 'balance' for 9000 ms or 9secs during these 9secs,Thread thr1 won't be able to access the shared variable balance.
				this.balance=this.balance+deposit_amount;
			}
		}
		public void display1()
		{
			System.out.println("i am from unsynchronized block");
		}
		
		
		public static synchronized void display()//a static method taking part in synchronization
		{
			System.out.println("i am from synchronized static");
		}
}
