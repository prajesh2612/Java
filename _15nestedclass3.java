package oops;
import java.io.*;
class faculty3
{
	private String name;
	private String empid;
	public faculty3(String iname,String iemp)
	{
		name=iname;
		empid=iemp;
	}
	
	public class Degree
	{
		String degree_name;
		String dyear;
		String awardedby;
		public Degree(String idname,String iyear,String iawardedby)
		{
			degree_name=idname;
			dyear=iyear;
			awardedby=iawardedby;
		}				
	}
	public void display_faculty_details(Degree d[]/*Here we are trying to read the array of objects of the inner class*/)/*Method to display
	                                                                                                                       faculty details*/
	{
		int i;
		System.out.println("The name of the faculty is: "+name);
		System.out.println("The employee ID of the faculty is: "+empid);
		for(i=0;i<d.length;i++)
		{
			System.out.println("The degree details of degree "+(i+1)+": "+d[i].degree_name+" "+d[i].dyear+" "+d[i].awardedby);
			//Here we are displaying the degree details of the faculty
		}
	}
}
public class _15nestedclass3 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int n,i;
		System.out.println("Enter the number of degrees of the faculty:");
		n=Integer.parseInt(in.readLine());
		//Create an object for the faculty class
		faculty3 f1=new faculty3("Satish","VIT0992");
		
		/*If a faculty member has multiple degrees. You should be able to print the faculty details along with the list of degrees that has been
		  awarded to him*/
		//Create an array of nested class object for the nested class degree
		faculty3.Degree degobj[]=new faculty3.Degree[n];
		String dname,year,givenby;
		for(i=0;i<n;i++)
		{
			System.out.print("Enter the name of the degree "+(i+1)+":");
			dname=in.readLine();
			System.out.print("Enter the year of the degree "+(i+1)+":");
			year=in.readLine();
			System.out.print("Enter the name of the institute who gave the degree "+(i+1)+":");
			givenby=in.readLine();
			degobj[i]=f1.new Degree(dname,year,givenby);//An indivisual object in the array of objects			
		}
		f1.display_faculty_details(degobj);//here we are the f1.display_faculty_details(array object of inner class) in the outer class		
	}
}
