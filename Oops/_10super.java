package oops;

class person2
{
	protected String name;
	protected String address;
	public person2(String n,String a)//parameterized constructor for initializing the data members of the base class: 'person2'
	{
		this.name=n;
		this.address=a;
		System.out.println("This is from the person2 class");/*This is to show the order in which the constructors present in the base
		                                                       class and the derived class gets executed*/
		                                                    /*on running the code we'll see that this line is printed first, because
                                                              in the hierarchy this class comes the 1st
                                                              the hierarchy is: person2-->faculty2-->professor2 */
	}
	protected void display_vitadd()
	{
		System.out.println("Vellore from person2 class");
	}
}
class faculty2 extends person2
{
	protected String empid;
	public faculty2(String n,String a,String e)//parameterized constructor for initializing the data members of the derived class:faculty2
	{
		super(n,a);/*super key: here it will send the parameters to the base class constructor: person2 for initialization of the data
                     members*/
		this.empid=e;
		System.out.println("This is from the faculty2 class");/*on running the code we'll see that this line is printed second, because
                                                                in the hierarchy this class comes the 2nd
                                                                the hierarchy is: person2-->faculty2-->professor2 */
	}
}
class professor2 extends faculty2
{
	protected String type;
	public int no_of_research_students;
	public professor2(String n,String a,String e,String t,int num)/*parameterized constructor for initializing the data members of the 
	                                                                derived class:'faculty2'*/
	{
		super(n,a,e);/*super key: here it will send the parameters to the base class constructor: faculty2 for initialization of the data
		               members*/
		this.type=t;
		this.no_of_research_students=num;
		System.out.println("This is from the profesor2 class");/*on running the code we'll see that this line is printed the last, because
		                                                         in the hierarchy this class comes the 3rd or last
		                                                         the hierarchy is: person2-->faculty2-->professor2 */
		                                                       
	}
	public void display_professor2()
	{
		System.out.println(name+" "+address+" "+empid+" "+type+" "+no_of_research_students);
	}
}
public class _10super
{
	public static void main(String[] args)
	{
		professor2 satish=new professor2("Satish","Kolkata","VIT0093","Associate Professor",5);
		satish.display_professor2();
		satish.display_vitadd();
		professor2 prajesh=new professor2("Prajesh","Jamshedpur","19BIT0422","Assistant Professor",0);
		prajesh.display_professor2();
		prajesh.display_vitadd();
	}
}
