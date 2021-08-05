package javalabdemo;
import java.io.*;
public class prog3 {
    public static void main(String[] args) throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int n,n1=0,d=0,r=0,sum=0;
        System.out.println("Enter a number:");
        n=Integer.parseInt(in.readLine());
        n1=n;
        while(n1!=0)
        {
            d=n1%10;
            r=r*10+d;
            n1=n1/10;
        }
        sum=n+r;
        if(sum%2!=0)
        {
            System.out.println("Odd Sum");
        }
        else
        {
            System.out.println("No Odd Sum");
        }
    }
}