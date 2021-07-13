package oops;

interface Shape2/*-Interface is a class in which all the methods can only be public and abstract
                 -Since, for an Abstract class, we can't form an object, similarly for an interface we can't form an object for Interface
                 -Interface do not have constructors
                 -interface can only have static and final variables which are public*/
{
	void getInput();
	void ComputeArea();
	void displayArea();
	//all the methods here are abstract and public only
}

class square2 implements Shape2/*Instead of 'extends' keyword, which we used for base class in inheritance, we'll be using the keyword
                              'implements' for Interface*/
{
	//in this class we'll provide implementation for all the methods in the interface
	//here we'll be overriding all the methods of the the interface
	public void getInput() 
	{
		System.out.println("This is to get the input the dimensions of square");
	}
	public void ComputeArea() 
	{
		System.out.println("This is to calculate the area of square");
	}
	public void displayArea() 
	{
		System.out.println("This is to display the area of square");
	}
}

class rectangle2 implements Shape2
{
	//in this class we'll provide implementation for all the methods in the interface
	public void getInput() 
	{
		System.out.println("This is to get the input the dimensions of rectangle");
	}
	public void ComputeArea() 
	{
		System.out.println("This is to calculate the area of rectangle");
	}
	public void displayArea() 
	{
		System.out.println("This is to display the area of rectangle");
	}
}


//An interface can extend another interface
interface twodshape extends Shape2//change interface twodshape
{
	void computeperimeter();
	void displayPerimeter();
	
	//come back later for this concept
	/*void displaymessage();/*-this is the extra changes done in the interface. Due to this change, there'll error shown in every class which 
	                         implements this interface because it is strictly needed to follow the rule of interface that all the methods present
	                         in the interface MUST be overridden by each and every class which implements it. 
	                        -Eg: Here, initially there was no
	                             'void displaymessage()' hence, no class did override this method. But as soon as this method was added to the 
	                              interface it is now neccessary to override this method in each and every class which implements this interface.*/
	
	/*-In industry point of view, it is not feasible to make changes in each and every class which implements an interface. because there may be 
	  hundreds-thousands of classes which would be implement an interface where we are making change
	  -Hence in order to overcome this problem, we use the 'default' keyword in the function signature of the method that we want to add*/ 
	default void displaymessage()
	{
		System.out.println("I'm the DEFAULT");
		/*In order to class this method, we can access it by using the syntax <interface name>.super.<method name>
		 *Eg: we'll call this method from the displayArea method in complexshape class*/
	}
	
}
class complexshape implements twodshape
{
    //here the class will have to override all the methods of the Shape2 interface as well as complexshape
	@Override
	public void getInput() 
	{
		System.out.println("I am getinput() from twodshape");
	}

	@Override
	public void ComputeArea()
	{
		System.out.println("I am ComputeArea() from twodshape");
	}

	@Override
	public void displayArea() 
	{
		twodshape.super.displaymessage();//here we'll be calling the default method in the implement twodshape
		System.out.println("I am displayArea() from twodshape");
	}

	@Override
	public void computeperimeter() 
	{
		System.out.println("I am computeperimeter() from twodshape");
	}

	@Override
	public void displayPerimeter()
	{
		System.out.println("I am displayPerimeter() from twodshape");
	}
	
}



//here a class is inheriting two interfaces at. Like this we can perform multiple inheritance using Interface.
class complexshape2 implements Shape2,twodshape
{
	//here class 'complexshape2' is overriding all the methods in Shape2, twodshape interfaces

	@Override
	public void computeperimeter() 
	{
		System.out.println("Message1");
	}

	@Override
	public void displayPerimeter() 
	{
		System.out.println("Message2");
	}

	@Override
	public void getInput() 
	{
		System.out.println("Message3");
	}

	@Override
	public void ComputeArea() 
	{
		System.out.println("Message4");
	}

	@Override
	public void displayArea() 
	{
		System.out.println("Message5");
	}	
}


public class _17interface 
{
	public static void main(String[] args)
	{
		square2 sq=new square2();//Object for class square
		sq.getInput();
		sq.ComputeArea();
		sq.displayArea();
		
		rectangle2 rec=new rectangle2();//Object for class rectangle
		rec.getInput();
		rec.ComputeArea();
		rec.displayArea();
		
        complexshape cs=new complexshape();
        cs.getInput();
        cs.ComputeArea();
        cs.displayArea();
        cs.computeperimeter();
        cs.displayPerimeter();
	}
}
