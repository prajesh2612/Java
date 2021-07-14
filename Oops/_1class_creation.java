package oops;
import java.io.*;
class Employee/* here we aren't using the Public access modifier for a class because in one JAVA file we can use Public access
               modifier for one class only*/
{
	/*attributes and methods of the objects (individual employee) who come under the class EMPLOYEES*/
	int id,salary=400,experience;/*here we have just initialized the variable salary to 400. The value stored in this variable may change
	                               according to the value set for an object, by the user, in the main method*/
	private int age;//here we are modifying the access of variable 'age', whose accessibility is limited within this class only
	String name;
	public int getAge()//this method is to access the private variable 'age', it would return this variable to the main method
	{
		return age;
	}
	public void setAge(int a)/*this method is to store the value in the variable 'age', the value stored in this variable is via main()
	                           method*/
	{
		age=a;
	}
	public void display(String name,int age1)/*this is the method used to display the parameters: name and age when invoked by the main()
	                                           method.*/
	{
		System.out.println("The age of "+name+"="+age1);
	}
	public int experience() throws IOException/*this method is for inputting value in the 'experience' variable and returning it to the
	                                            main() function*/
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		experience=Integer.parseInt(in.readLine());	
		return experience;
	}	
}
public class _1class_creation {
	public static void main(String[] args) throws IOException
	{
		System.out.println("This is your custom class");
		Employee prajesh = new Employee();// a new object: Prajesh (one of the entities in the class Employee) is been created 
		
		//setting values related to an employee, Prajesh to the various attributes in the class Employee
		prajesh.id =12;//syntax to set a value to an attribute of a PARTICULAR object: <object name>.<attribute>=<value>
		prajesh.name="Prajesh Raj Singh";
		
		//displaying the infos related to employee Prajesh
		System.out.println("The names is:"+prajesh.name);
		System.out.println("The id is:"+prajesh.id);	
		
		//We can add as many objects( here employees) by similary following the above procedure
		//Eg: Let us consider other employees(objects) in the class Employee
		
		Employee ramesh=new Employee();//an object is been created for the employee Ramesh
		Employee ritika=new Employee();//an object is been created for the employee Ritika
		//setting values related to each employee(or objects) stated above
		ramesh.id=13;
		ramesh.name="Ramesh Prasad Singh";
		
		ritika.id=14;
		ritika.name="Ritika Sharma";
		
		//Display their infos
		//For Ramesh:
		System.out.println("The names is:"+ramesh.name);
		System.out.println("The id is:"+ramesh.id);	
		
		//For Ritika:
		System.out.println("The names is:"+ritika.name);
		System.out.println("The id is:"+ritika.id);	
		
		
		/*We can call methods in the class for a particular object, eg: we'll try to enter and display the age of a particular
		 object by calling the methods in the class Employee*/
		System.out.println("Enter the age of "+prajesh.name);
		int age;
		prajesh.setAge(21);//here we are invoking the method setAge() in Employee class in order to set the age of the Object prajesh
	    age=prajesh.getAge();//here we are invoking the method getAge() in Employee class to get the age of object prajesh
		prajesh.display(prajesh.name,age);//here we are calling the display function to display the age entered 
		
		System.out.println("Salary of "+prajesh.name+"="+prajesh.salary);/*Without changing the value stored in the object
		                                                                     attribute 'salary', in Employee Class(400 is displayed)*/
		ritika.salary=600;/*On changing the value stored in the object
		                    attribute 'salary', in Employee Class*/
		System.out.println("Salary of "+ritika.name+"="+ritika.salary);//(600 is displayed)
		
		System.out.println("Enter the age of "+ritika.name);
		ritika.setAge(26);
		age=ritika.getAge();
		ritika.display(ritika.name, age);
		
		int exp;
		System.out.println("Enter the years of experience of "+prajesh.name+":");
		exp=prajesh.experience();
		System.out.println("The the years of experience of "+prajesh.name+":"+exp);
		System.out.println("Enter the years of experience of "+ritika.name+":");
		exp=ritika.experience();
		System.out.println("The the years of experience of "+ritika.name+":"+exp);
	}
}
