package Threads;

public class _09Synchronized 
{
	public static void main(String[] args) throws InterruptedException
	{
		account prajesh=new account(20000);//object for account class, the balance is initialized
		//This thread object is for one thread process
		Thread thr1=new Thread(new Runnable()
				{
			public void run()//Overriding the run() method in the Runnable interface
			{
				int i;
				for(i=0;i<50;i++)
				{
					prajesh.withdraw(100);
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
			prajesh.withdraw(100);
		}
	}			
		});
		
		thr1.start();
		thr2.start();
		/*Here Thread thr1 and Thread thr2 is doing manipulation on same amount simultaneously. But due to the race condition between these
		  threads, these processes are very unsynchronized and we are not able to obtain a consistent result*/
		thr1.join();
		thr2.join();
		
		System.out.println(prajesh.balance);
		//On multiple execution we'll see that there is an inconsistent trends in the final result, hence this would lead to a memory inconsistency
	}
}

class account 
{
		public int balance;
		public account(int deposit)
		{
			this.balance=deposit;
		}
		public void withdraw(int withdraw_amount)
		{
			this.balance=this.balance-withdraw_amount;
		}
}

