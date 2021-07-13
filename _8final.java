 package oops;

final class person1//final (for class): used to prevent any class from inheriting this class
{
	protected String name;
	protected String address;
	public person1()
	{
		this.name="Prajesh";
		this.address="Adityapur";
	}
	protected void display_vitadd()
	{
		System.out.println("VIT Vellore from person class");
	}
	protected void display_person1()
	{
		System.out.println(name+" "+address);
	}
}
/*class student1 extends person1: here we'll get error because we are trying to inherit the 'person' class, but due to 'final' keyword, 
 *                                it's forbidden
{
	public String regno;
	public student1()//default constructor for class student to initialize its data members
	{
		this.regno="19BIT0422";
	}
	public void display_student1()
	{
		System.out.println(name+" "+address+" "+regno);		
	}
}*/
class student1
{
	String name;
	public String regno;
	protected final int age=15;/*final (for variable): we can inherit this variable on inheriting the class (if not private) but we can't 
	                             change the value stored in it*/
	                           /*we cannot re-initialize this final variable using a constructor, that is we cannot change the value stored
	                             the final variable using a constructor also*/
	public student1()
	{
		//this.age=21;: here we'll get error since we are trying to re-initialize a final variable 
	}
	protected final void display_vitadd()/*final (for method): although we can inherit this method from the base class to the derived 
	                                       class but we can't override this method*/
	{
		System.out.println("VIT Vellore from student1 class");
	}	
}
class address extends student1
{
	String h_no;
	protected String city;
	public String district;
	String state;
	public address()
	{
		this.name="Prajesh";
		this.regno="19BIT0422";
		//this.age=21; :here we'll get an error because we are trying to change the value of the final variable of base class
		this.h_no="MA-29 New Housing Colony";
		this.city="Jamshedpur";
		this.district="Saraikela Kharsawan";
		this.state="Jharkhand";		
	}
	/*protected final void display_vitadd()
	{
		System.out.println("VIT Vellore from address class");
	} :Here we'll get error because we are trying to override a final method from the base class in the derived class*/
	public void display_address()
	{
		System.out.println(name+" "+regno+" "+age +"years"+" "+h_no+" "+city+" "+district+" "+state);
	}
} 
public class _8final
{
	public static void main(String[] args)
	{
		address prajesh= new address();
		prajesh.display_address();
	}
}
