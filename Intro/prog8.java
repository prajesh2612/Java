package javalabdemo;
import java.io.*;
public class prog8 {
    public static void main(String[] args) throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int n,n1=0,d=0,c1=0,c2=0,c3=0,i,c=0;
        System.out.println("Enter a number:");
        n=Integer.parseInt(in.readLine());
        n1=n;
        while(n1!=0)
        {
            d=n1%10;
            if(d%2!=0)
            {
                c1++;
            }
            else if(d%2==0)
            {
                c2++;
            }
            for(i=1;i<=d;i++)
            {
                if(d%i==0)
                {
                    c++;
                }
            }
            if(c==2)
            {
                c3++;
            }
            c=0;
            n1=n1/10;
        }
        System.out.println("The number of odd digits="+c1);
        System.out.println("The number of even digits="+c2);
        System.out.println("The number of prime digits="+c3);
    }
}