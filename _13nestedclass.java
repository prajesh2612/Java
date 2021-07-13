package oops;

class outer
{
	public String var1;
	private String var2;
	protected String var3;
	public static int count=1;
	
	public outer()//Constructor of outer class where the instance variables of the outer class are initialized
	{
		var1="Test1";
		var2="Test2";
		var3="Test3";
	}
	class nested/*-It is the nested class which is embedded within the outer class.
	              -Can be public or protected or protected. By making it private, we are hiding this entire class from the outside world.
	               This helps in increases encapsulation. 	                     
	              -Nested class can access all kinds of data members (public, protected,private,static) of the outer class.
	              -The outer class cannot access of the data members (variables or methods) of the inner class, even though the data members
	                of inner class is public
	              -A class that is nested and not static is called 'inner class'.(here,'nested' class)*/
	{
		public void display()//here we'll test whether the inner class can access all the kinds of the variables of the outer class
		{
			System.out.println(var1+" "+var2+" "+var3+" "+count);
		}
		/*Q. Can we have a static data members and methods in our nested class? Ans: NO
		 *Reason: This because since the nested class is already a data member of the outer class and it becomes impossible to access the
		          nested class by the object of the outer class*/
		//public static String name="Prajesh";//here it'll show an error because we are trying to declare a static variable in a nested class
		
		//We cannot have a static method in a non-static class (here: 'nested' class)
		/*public static void calculate()//here we'll get an error because we are trying to have a static method in a non-static class
		{
			int a=2;
			int b=3;
			int sum=a+b;
		}*/
		
		public String nested_var="Nested Variabe";//a public variable in the nested class		
	}
	
	/*public void display_nestedclassvariable()//this is to prove whether the outer class can access any variable of the nested class
	 {
		System.out.println(nested_var);/*here we'll get an error because we are trying to access the inner class variable from the outer 
		                                 class which is not allowed
	 }*/
}
public class _13nestedclass
{
	public static void main(String[] args)
	{
		//first we need to create an object for the outer class
		outer outobj=new outer();
		
		//then we'll create an object for the nested (or inner) class using the outer class object
		outer.nested nestedobj=outobj.new nested();
		
		nestedobj.display();
	}

}
   