/*
Create a class Employee with the following properties and methods:
Salary (property) (int)
getSalary (method returning int)
name (property) (String)
getName (method returning String)
setName (method changing name)*/
package oops;
class Employees{
	int Salary;
	String name;
	public int getSalary()
	{
		return Salary;
	}
	public void setName(String n)
	{
		name=n;
	}
	public String getName()
	{
		return name;
	}
}
public class _2practice {
	public static void main(String[] args)
	{
		Employees employee1=new Employees();
		employee1.setName("Prajesh Raj Singh");//setting the name of the object employee1
		employee1.name=employee1.getName();//getting the name of the object employee 1
		employee1.Salary=30000;//setting the value of Salary of the object employee 1
		employee1.Salary=employee1.getSalary();//getting the value of the Salary of the object Employee 1
		System.out.println("The salary of "+employee1.name+" is="+employee1.Salary);	
	}
}
