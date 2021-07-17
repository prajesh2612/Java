package datastructures;
import java.util.LinkedList;
import java.util.ListIterator;

public class _05LinkedList {
	public static void main(String[] args)
	{
		Employee e1=new Employee("19BIT0422","Prajesh","Jamshedpur");
		Employee e2=new Employee("19BEE0426","Ayush","Vijaywada");
		LinkedList<Employee>emp=new LinkedList<Employee>();//LinkedList for objects of class Employee
		emp.add(e1);
		emp.add(e2);
		//We'll traverse the LinkedList from backwards using 'ListIterator'
		ListIterator<Employee> litr=emp.listIterator(emp.size());
		while(litr.hasPrevious()==true)
		{
			Employee t=(Employee)litr.previous();
			System.out.println(t.empId+" "+t.name+" "+t.address);
		}
	}
}
class Employee
{
	String empId;
	String name;
	String address;
	public Employee(String e,String n,String a)
	{
		this.empId=e;
		this.name=n;
		this.address=a;
	}
}