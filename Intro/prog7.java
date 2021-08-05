package javalabdemo;
import java.io.*;
public class prog7 {
    public static void main(String[] args) throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int f=1,a,b,sum=0,ch;
        while(f!=0)
        {
            System.out.println("Enter your choice:");
            System.out.println("1 for adding process");
            System.out.println("2 for ending the process process");
            ch=Integer.parseInt(in.readLine());
            switch(ch)
            {
                case 1:
                    System.out.println("Enter the two numbers to be added:");
                    a=Integer.parseInt(in.readLine());
                    b=Integer.parseInt(in.readLine());
                    sum=a+b;
                    System.out.println("The sum="+sum);
                    break;
                case 2:
                    System.out.println("The Process is terminated");
                    f=0;
                    break;
                default:
                    System.out.println("Wrong Input");
                    break;
            }
        }
    }
}