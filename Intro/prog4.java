package javalabdemo;
import java.io.*;
public class prog4
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int n;
        System.out.print("Enter the room number:");
        n=Integer.parseInt(in.readLine());
        if(n==823)
        {
            System.out.println("Java Programming");
        }
        else if(n==824)
        {
            System.out.println("Python Programming");
        }
        else
        {
            System.out.println("Invalid Input");
        }
    }
}