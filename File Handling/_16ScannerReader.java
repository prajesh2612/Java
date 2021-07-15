package FileHandling;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class _16ScannerReader
{
	//Scanner is only for reading data, not writing
		    public static void main(String args[]) throws FileNotFoundException {
	 
	        try
	        {
	        	//creating File instance to reference text file in Java
		        File text = new File("scannet.txt");
		     
		        //Creating Scanner instance to read File in Java
		        Scanner scnr = new Scanner(text);
		     
		        //Reading each line of file using Scanner class
		        int lineNumber = 1;
		        while(scnr.hasNextLine())//hasNextLine() is a boolean type method which returns true if there is next line in the file, else returns false and the program terminates
		        	{
		            String line = scnr.nextLine();//nextLine() is a string type method which returns ith line in the file at ith iteration
		            System.out.println("line " + lineNumber + " :" + line);
		            lineNumber++;
		        }  
		        scnr.close();
		        
		        
		        
		        
		        File text2 = new File("scanner.txt");
		        Scanner scnr2 = new Scanner(text2);
		        System.out.println(scnr2.delimiter());//delimiter() returns the kind of characters used to separate the words in the file (eg: here initially is the 'whitespace')
		        scnr2.useDelimiter("@");//useDelimiter(String) method is used to set characters separating the words in the file on the basis of the character present in the argument (Eg: Here the word separator would be "@")
		       
		       while(scnr2.hasNext()) {
		       String word=scnr2.next();//next() is a string type method which returns ith word in the file in the ith iteration
		       System.out.println(word);
		        }
		       scnr2.close();
		       
		       
		       
		       
		     
		        File text3 = new File("scanner2.txt");
		        Scanner scnr3 = new Scanner(text3);
		        	        int a[]=new int[10];//this array would store all the integer data which scanner class would read from the file
		        
		       int i=0;
		       while(scnr3.hasNext()) {
		       a[i]=scnr3.nextInt();//nextInt() is an integer type method which returns ith number in the file in the ith iteration
		       i++;
		        }
		       for(int k:a)
		       {
		    	   System.out.println(k);//all the integer data from the file read by the Scanner class and stored in the array a is displayed
		       }
		       scnr3.close();
	        }
	        
	        catch(Exception e)
	        {
	        	System.out.println(e.getMessage());
	        }
	   
	    }  
	 
	}

