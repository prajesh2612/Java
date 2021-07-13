package oops;
import java.io.*;
abstract class Shape/*-An abstract class does not have any object for itself
                      -Can only be used as super class in the inheritance hierarchy
                      -The derived classes of an abstract class are called 'Concrete Class'
                        Concrete class: Those classes which have definitions for all its methods*/
{
	double area;//This variable would store the area of the shape defined in that particular derived class
	public abstract void computearea();/*-An abstract method does not consist of any operation.
	                                      For example: here class shape does not specify a particular shape, it just denotes regarding what
	                                                   we are programming. Hence, there would be no operation taking place in this abstract
	                                                   method
	                                     -The presence of an abstract method means that the class is also of an abstract type, even though
	                                      if it is not defined while defining the class*/
	public void display_Area()/*This method would be inherited by all the derived classes to display the area of the shape defined by the
	                            respective class*/
	{
		System.out.println(area);
	}
}
class rectangle extends Shape
{
	int length;
	int breadth;
	public rectangle(int l,int b)//parameterized constructor to initialize the dimensions of the rectangle
	{
		length=l;
		breadth=b;
	}
	public void computearea()/*Here we are overriding the abstract method of the Shape class (which happens to be abstract) in order to
	                           compute the area of the shape which is defied in the current derived class (Eg: here, rectangle)*/
	                         /*If we don't provide this method in the derived class, then we'll get error*/
	{
		area=length*breadth;
	}
}
class square extends Shape 
{
	int side;
	public square()//non-parameterized constructor to initialize the dimension of square
	{
		side=10;
	}
	public void computearea()
	{
		area=side*side;
	}
}
class circle extends Shape
{
	int radius;
	public circle()
	{
		radius=21;
	}
	public void computearea()
	{
		area=(22/7.0)*(radius*radius);
	}
}
class triangle extends Shape
{
	int base;
	int heigth;
	public triangle(int b1,int h1)
	{
		base=b1;
		heigth=h1;
	}
	public void computearea()
	{
		area=(1/2.0)*(base*heigth);
	}
}
public class _11abstract 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		//Rectangle
		rectangle rect=new rectangle(4,5);
		rect.computearea();
		rect.display_Area();
		
		//Square
		square sq=new square();
		sq.computearea();
		sq.display_Area();
		
		//Circle
		circle cir=new circle();
		cir.computearea();
		cir.display_Area();
		
		
		//Triangle
		int base1,heigth1;
		System.out.print("Enter the base of the triangle:");
		base1=Integer.parseInt(in.readLine());
		System.out.print("Enter the heigth of the triangle:");
		heigth1=Integer.parseInt(in.readLine());
		triangle tri=new triangle(base1,heigth1);
		tri.computearea();
		tri.display_Area();
	}
}
