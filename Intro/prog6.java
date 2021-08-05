package javalabdemo;
import java.io.*;
public class prog6 {
    public static void main(String[] args) throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int n,i;
        System.out.print("Enter the number whose table you want:");
        n=Integer.parseInt(in.readLine());
        System.out.println("The multiplication table is:");
        for(i=1;i<=10;i++)
        {
            System.out.println(n+" x "+i+"= "+(n*i));
        }
    }
}