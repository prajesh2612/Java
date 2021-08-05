package javalabdemo;
import java.io.*;
public class prog9 {
    public static void main(String[] args) throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int n,i,bonus=0;
        String wd;
        System.out.println("Enter the number of employees:");
        n=Integer.parseInt(in.readLine());
        String name[]=new String[n];
        String phn[]=new String[n];
        int exp[]=new int[n];
        for(i=0;i<n;i++)
        {
            System.out.println("Enter the employee details:");
            System.out.print("Name:");
            name[i]=in.readLine();
            System.out.print("Phone Number:");
            phn[i]=in.readLine();
            System.out.print("Years of experience:");
            exp[i]=Integer.parseInt(in.readLine());
        }
        System.out.print("Enter the name for the bonus:");
        wd=in.readLine();
        for(i=0;i<n;i++)
        {
            if(wd.equals(name[i]))
            {
                if(exp[i]>=3)
                {
                    bonus=500*(exp[i]-3);
                    System.out.println("Bonus="+bonus);
                    System.out.println("Mobile Number="+phn[i]);
                }
                else
                {
                    System.out.println("Not eligible for bonus");
                }
                break;
            }
            else
            {
                System.out.println("Name not found");
                System.out.println("Not eligible for bonus");
            }
        }
    }
}