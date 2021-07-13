package oops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

abstract class Shape1
{
	double area;
	public abstract void computearea();
	public void display_Area()
	{
		System.out.println(area);
	}
}
class rectangle1 extends Shape1
{
	int length;
	int breadth;
	public rectangle1(int l,int b)//parameterized constructor to initialize the dimensions of the rectangle
	{
		length=l;
		breadth=b;
	}
	public void computearea()
	{
		area=length*breadth;
	}
}
abstract class square1 extends Shape1/* we can make an abstract derived class of an abstract class*/ 
{
	/*int side;
	public square1()//non-parameterized constructor to initialize the dimension of square
	{
		side=10;
	}
	public void computearea()
	{
		area=side*side;
	}
	Since the square class is an an abstract class due to the presence of the abstract method: perimeter(), hence we can't form an object
	of class 'square'. Therefore, we won't be able to find the area of square as we did in the previous program */
	double perimeter;
	abstract void perimeter();//Abstract method of the class: square
	public void display_perimeter()
	{
		System.out.println(perimeter);
	}
}
class circle1 extends square1
{
	int radius;
	public circle1()
	{
		radius=21;
	}
	public void computearea()
	{
		area=(22/7.0)*(radius*radius);
	}	
	public void perimeter()
	{
		perimeter=2*(22/7)*radius;
	}
	/*Since the class circle1 is inheriting class square1 which in turn, is inheriting class shape1, it is necessary for us to override both
	  the abstract methods in the hierarchical order. So here we'll first invoke the abstract method computearea() of the class Shape1
	  (which happens to be the base class of class:'square1') and then the abstract method perimeter() of the class square (which happens
	   to be the base class of class:'circle1')*/
}
class triangle1 extends Shape1
{
	int base;
	int heigth;
	public triangle1(int b1,int h1)
	{
		base=b1;
		heigth=h1;
	}
	public void computearea()
	{
		area=(1/2.0)*(base*heigth);
	}
}
public class _12abstract2 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		//Rectangle
		rectangle1 rect=new rectangle1(4,5);
		rect.computearea();
		rect.display_Area();
		
		/*//Square
		square1 sq=new square1();
		sq.computearea();
		sq.display_Area();
		Here we'll get error, since we'can't form an object for the class square as we did in the previous program because now this
		class is an abstract class*/
		
		//Circle
		circle1 cir=new circle1();
		cir.computearea();
		cir.display_Area();
		
		cir.perimeter();
		cir.display_perimeter();
		
		
		//Triangle
		int base1,heigth1;
		System.out.print("Enter the base of the triangle:");
		base1=Integer.parseInt(in.readLine());
		System.out.print("Enter the heigth of the triangle:");
		heigth1=Integer.parseInt(in.readLine());
		triangle1 tri=new triangle1(base1,heigth1);
		tri.computearea();
		tri.display_Area();
	}

}
