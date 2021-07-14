package oops;
class faculty4
{
	private String name;
	private String empid;
	private static int count=1;
	
	public faculty4(String iname,String iempid)
	{
		name=iname;
		empid=iempid;
	}
	public void display_facultydetails()
	{
		System.out.println("The name of the faculty is: "+name);
		System.out.println("The employee ID of the faculty is: "+empid);
	}
	
	public static class eligible_leave/*-This is a static nested class because the eligibility criteria for leave is common for all the faculty
	                                     object.
	                                    -If we don't define this class as a static class, we'll have to separately define the data members for 
	                                     each faculty object, although the values stored in these data members is same for all the faculty object*/
	{
		public static int el=12;//earned leave
		public static int ml=20;//medical leave
		public static int cl=10;//casualty leave
		//We have static variables here because we won't be needing an object to access the variables of the static class
		
		public static void display_leavedetails()//This static method is used to display the leave details which is common to every faculty object 
		{
			System.out.println("The number of Earned Leave is: "+el);
			System.out.println("The number of Medical Leave is: "+ml);
			System.out.println("The number of Casualy Leave is: "+cl);
			
			//Static nested class cannot access the non-static data members of outer class
			/*System.out.println(name+" "+empid);//here we'll get error because we're trying to access the non-static variables of outer class, in 
			                                      the static nested class*/
			
			//Static nested class can access the static data members of outer class
			System.out.println(count);/*here we'll not get error because we're trying to access the static variable of outer class, in the
			                            static nested class*/			 
		}
		
		/*-We can have static as well as non-static data members in the static nested class. Static data members case is discussed above
		  -for non-static data member*/
		 public int var1;/*-a non-static variable in the static nested class
		                   -in order to access this variable we'll be needing an object of type 'eligible_leave'*/
		 public eligible_leave()//a constructor for nested class where the non-static variable is initialized
		 {
			 var1=10;
		 }
		 public void display_var()/*-a non-static method in the static nested class
		                            -in order to call or invoke this method we'll be needing an object of type 'eligible_leave'*/
		 {
			 System.out.println("The value of non-static variable being printed from the non-static method in a static class: "+var1);
		 }
	}
	/*-for accessing the non-static data member of the static nested class, we need an object of the static nested class.
	  -here, we'll be forming the object of the static nested class just outside the static nested class, within the outer class, instead of 
	   forming it in the main method*/
	eligible_leave l1=new eligible_leave();//object for the static nested class
}
public class _16staticnestedclass
{
	public static void main(String[] args)
	{
		faculty4.eligible_leave.display_leavedetails();
		/*here we are directly calling the nested class and method of our interest because we don't need to form any object to call the static 
		  class and method.
		  Syntax:(outer class).(inner class).(method name());*/
		
		//In order to access the non-static data members of the static nested class, we'll have to create an object for the 
		faculty4 f1=new faculty4("Satish","VIT0092");//Object of the outer class 'faculty4'
		f1.display_facultydetails();//calling the display_facultydetails() method of the outer class 
		f1.l1.display_var();/*Calling the non-static method of the static nested class using the object of the outer class: 'f1' and the static
		                      nested class: 'l1'*/		
	}
}
