package javalabdemo;
import java.io.*;
public class prog2
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        double r,Area=0.0;
        System.out.print("Enter the rasdius of circle:");
        r=Double.parseDouble(in.readLine());
        Area=(22/7.0)*(Math.pow(r,2));
        System.out.println("The Area of circle="+Area);
    }
}