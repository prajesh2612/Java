package oops;
import java.io.*;
class Products
{
	String productID,productName,productCompany,productManufacturedDate;
	int serialNumber,price;
}
public class _3object_array {
	public static void main(String[] args) throws IOException
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int n,i;
		System.out.println("Enter the number of products whose details should be entered:");
		n=Integer.parseInt(in.readLine());
		Products product[]=new Products[n];//here we are creating an array of objects(here products) of type class Products
		for(i=0;i<n;i++)
		{
			product[i]=new Products();//here we are assigning space for our objects, if we don't do this we'll get Null Pointer Exception
		}
		for(i=0;i<n;i++)
		{
			System.out.println("Enter the name of the product "+(i+1));
			product[i].productName=in.readLine();
			System.out.println("Enter the name of the company of product "+(i+1));
			product[i].productCompany=in.readLine();
			System.out.println("Enter the ID of the product "+(i+1));
			product[i].productID=in.readLine();
			System.out.println("Enter the manuactured date of the product "+(i+1));
			product[i].productManufacturedDate=in.readLine();
			System.out.println("Enter the serial number of the product "+(i+1));
			product[i].serialNumber=Integer.parseInt(in.readLine());
			System.out.println("Enter the price of the product "+(i+1));
			product[i].price=Integer.parseInt(in.readLine());
		}
		for(i=0;i<n;i++)
		{
			if((product[i].productCompany).equals("Samsung")==true)
			{
				System.out.println(product[i].productName);
			}
			if((product[i].productName).contains("laptop"));
			{
				System.out.println(product[i].productName);
			}
		}		
	}
}
