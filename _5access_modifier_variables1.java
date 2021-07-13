package oops;
class Test
{
	public int x;//we can access this variable from any class and package, via object creation in those foreign classes/packages
	
	int y;//we can access this variable from any class via object creation in that class, within the same package
	
	private int z;/*we cannot access this variable from different classes or package by the simple procedure of object creation in the
	                foreign class*/
	//But we can access the above private variable via using methods like: get() and set(argument)
	public void setZ(int z1)/*this method is used to set the value of private variable z, entered by the user via object creation method 
	                          in other class*/
	{
		z=z1;
	}
	public int getZ()//this method is used to return the value of z, set in setZ(value) mrthod 
	{
		return z;
	}
	
	//But we can access the above variable via simple procedure of object creation
	
	/*We can also access the private variable via using the simple object creation method, by creating an object and accessing it 
	  in the same class where the private variable is been declared,discussed in next method, display()*/
	public static void display()
	{
		Test tz=new Test();//'tz' is an object of class Test, is been created within the class Test itself
		tz.z=10;//here we have simply used the '.' operator to manipulate the value stored in z, although it is a private variable
		System.out.println("The value stored in the variable z(using same class method)="+tz.z);/*Output: The value stored in the variable
		                                                                                                   z=10*/
	}
}


public class _5access_modifier_variables1 {
	public static void main(String[] args)
	{
		Test t=new Test();//t is an object of class Test 
		
		t.x=12;/*manipulation of value stored in public variable x, in class Test. The value can be manipulated
		          from any class or package (since it is a public variable)*/
		System.out.println("The value stored in the variable x="+t.x);//Output: The value stored in the variable x=12
		
		t.y=11;/*manipulation of value stored in default( or no access-modifier specified) variable y, in class Test. 
		          The value can be manipulated from any class within the same package only (since it is a default variable)*/
		System.out.println("The value stored in the variable y="+t.y);//Output: The value stored in the variable y=111
		
		t.setZ(10);//here we are invoking the method setZ(value) in order to set the value of private variable z=10
		System.out.println("The value stored in the variable z="+t.getZ());/*here we are invoking the method getZ() in order to
		                                                                     get the value stored in private variable z of class Test*/
		                                                                   //Output: The value stored in the variable z=10
		
		Test.display();//calling the display() method in the class Test
	}
}
