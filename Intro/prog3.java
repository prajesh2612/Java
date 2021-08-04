package javalabdemo;
import java.io.*;
public class prog3 {
    public static void main(String[] args) throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int Year;
        System.out.print("Enter the year:");
        Year=Integer.parseInt(in.readLine());
        if((Year%400==0)||((Year%4==0)&&(Year%100!=0)))
        {
            System.out.println("Leap Year");
        }
        else
        {
            System.out.println("Not Leap Year");
        }
    }
}