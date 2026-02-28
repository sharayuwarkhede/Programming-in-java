//package Assignments;

import java.util.Scanner;
class Circle 
{
    //int r;//declare variable (radius of circle)
    Circle(int r)//parameterized constructor circle
    {
        this.r=r;

    }
	double area(int r) 
    {
		double a=3.14*r*r;
		return a;
	}
	double perimeter(int r) 
    {
		double p=2*3.14*r;
		return p;
	}
	
}
public class Assignment3B 
{
    public static void main(String args[])
    {
        int ch=0;
        Scanner sc = new Scanner(System.in);//creating scanner object
        System.out.print("Enter radius of first circle: ");
        int r1= sc.nextInt();
        System.out.print("Enter radius of second circle: ");
        int r2= sc.nextInt();
        Circle c1= new Circle(r1);//creating circle object
        Circle c2= new Circle(r2);
        while (ch!= 3)
	{
		System.out.println("Comparing the circle");
		System.out.println("---Menu---");
		System.out.println("1.Compare using area:");
		System.out.println("2.Compare using perimeter:");
		System.out.println("3.End ");
		System.out.println("Enter your choice:");
		 ch = sc.nextInt();
        switch(ch)
        {
        case 1:
            if(c1.area(r1)>c2.area(r2))
            {
           	 System.out.println("The circle with radius "+ r1+" is the greatest!");
            }
            else
            {
           	 System.out.println("The circle with radius "+ r2+" is the greatest!");
            }
            break;
        case 2:
            if(c1.perimeter(r1)>c2.perimeter(r2))
            {
           	 System.out.println("The circle with radius"+ r1+" is the greatest!");
            }
            else
            {
           	 System.out.println("The circle with radius"+ r2+" is the greatest!");
            }
            break;
        case 3:
       	 System.out.println("Execution is stopped.");
       	 break;
       	
        default:
       	 System.out.println("Invalid input!!");
    }

    }
    }   
}
