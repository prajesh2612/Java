package oops;
class faculty1
{
	private String name;
	private String empid;
	public faculty1(String iname,String iemp)
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
		
		public void display_facultydetails()//In this method we are trying to print the variables from the outer as well as the inner classes
		{
			System.out.println("The faculty name is:"+name);
			System.out.println("The employee ID of the faculty is:"+empid);
			System.out.println("The Degrree details: "+degree_name+" "+dyear+" "+awardedby);
		}		
	}
}
public class _14nestedclass2 
{
	public static void main(String[] args)
	{
		//Create an object for the faculty class
		faculty1 f1=new faculty1("Satish","VIT0992");
		
		//Create an object for the nested class degree
		faculty1.Degree degobj=f1.new Degree("Btech","2020","VIT");
		degobj.display_facultydetails();
	}

}
