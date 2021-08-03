package javalabdemo;
import java.io.*;
public class prog1 {
    public static void main(String[] args) throws IOException {
// TODO Auto-generated method stub
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int n;
        System.out.print("Enter a numebr:");
        n=Integer.parseInt(in.readLine());
        if(n%2==0)
        {
            System.out.println("The number is even");
        }
        else
        {
            System.out.println("The number is odd");
        }
    }
}
