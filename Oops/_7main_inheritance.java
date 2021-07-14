package oops;

class person //base class
{
	//Base class instance variables
	protected String name;//protected variable, that is only the derived classes of this base class:'person' can access these variables
	protected String address;
	protected void display_vitadd()/*protected method, that is this method is only accessible to those classes only which are derived from 
	                                 this Base class:'person'*/
	{
		System.out.println("VIT Vellore from person class");
	}
	/*Note: a private variable of base class cannot be accessed by any of its derived class*/
	
}
//Identify student Class
class student extends person//student class inherits from person class
{
	public String regno;
	public student()//default constructor for class student to initialize its data members
	/*This class has regno variable already assigned to it, while the variables name, address are inherited from the super class*/
	{
		this.name="Prajesh";//this keyword is used to define a particular varible for the current class only
		this.regno="19BIT0422";
		this.address="Jamshedpur";
	}
	public void display_student()
	{
		System.out.println(name+" "+address+" "+regno);		
	}
}
//Identify faculty class
class faculty extends person//faculty class inherits from person class
{
	public String empid;
	protected void display_vitadd()//Method overriding: here we are overriding the method display_vitadd() from the base class: person
	                              /* Method overriding: Having the same method signature(access modifier+return type+name) and
	                                 different implementation in your subclass than  the parent class method*/
	                             //we can override only public and protected methods in the derived class
	{
		System.out.println("VIT Vellore from faculty class");
	}
}
//Identify professor class
class professor extends faculty//professor class inherits faculty class
{
	public String type;
	public int n;
	public professor()//default constructor for class professor to initialize its data members
	{
		this.name="Satish";
		this.empid="VIT0092";
		this.address="Kolkata";
		this.type="Associate";
		this.n=5;
	}
	public void display_professor()
	{
		System.out.println(name+" "+address+" "+empid+" "+type+" "+n);
	}	
}
public class _7main_inheritance
{
	public static void main(String[] args)
	{
		student prajesh=new student();//object created for student class
		prajesh.display_vitadd();//student class object calling the method from the Base class
		/*Actually here we treat the data members of the base class as the data members of the derived class.
		 * Here the memory is allocated for variables(public, protected, private) for base class as well as derived class.
		 * But the derived class object can only access the public and the protected date members(variables)*/
		prajesh.display_student();//student class object calling method from the student class
		
		//Similarly for class faculty--> professor
		professor satish=new professor();//object created for 'professor' class
		satish.display_vitadd();//professor class object calling the overridden method from the Base class('faculty')
		satish.display_professor();//professor class object calling method from the professor class
	}
}
