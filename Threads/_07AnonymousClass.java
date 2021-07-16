package Threads;
/*:Here we are using the concept of anonymous class.
  :We can apply this concept only using an abstract class or an interface*/ 

//Let us consider an abstract class
abstract class employee
{
	public abstract void display();
}
/*
class professor extends employee
{
	public void display()
	{
		System.out.println("I am from class professor");
	}
}
*/

//Similarly in case of an interface
interface employee1
{
	public void display1();
}
/*
class professor1 implements employee1
{
	public void display1()
	{
		System.out.println("I am from class professor1");
	}
}
*/


public class _07AnonymousClass
{
	public static void main(String[] args)
	{
		//In case of abstract class employee
		
		/*//If we don't use an anonymous class
		professor satish=new professor();//Object of class employee
		satish.display();*/
		
		/*Instead of creating a whole separate class for such a simple job, we can do the same thing by creating an inner class
		  within this main method. This is known as Anonymous class*/
		//Anonymous class for abstract class employee
		employee satish=new employee(){
			public void display()
			{
				System.out.println("I am from anonymous class");
			}
		};
		satish.display();//here we are calling the display() method of the class employee.
		
		
		
		//In case of interface employee1
		/*//If we don't use anonymous class
		{
			professor1 satish1=new professor1();
			satish1.display1();
		}*/
		
		//Anonymous class for interface employee1
		employee1 satish1=new employee1() {
			public void display1()
			{
				System.out.println("I am from another anonymous class");
			}
		};
		satish1.display1();//here we are calling the display1() method of the class employee1.
	}	
}
