//package Assignments;
//package assignment3;
import java.util.Scanner;
class Circle {
	double a,p;
	double area(double r) {
		a=3.14*r*r;
		return a;
	}
	double perimeter(double r) {
		p=2*3.14*r;
		return p;
	}
	
}
public class Assignment3A {
	public static void main(String[] args) {
	double r1,r2;
	int ch=0;
	System.out.println("Enter the radius of 1st circle:");
	Scanner sc=new Scanner(System.in);
	r1=sc.nextDouble();
	System.out.println("Enter the radius of 2nd circle:");
	r2=sc.nextDouble();
	Circle c = new Circle ();
	while ( ch!= 3)
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
            if(c.area(r1)>c.area(r2))
            {
           	 System.out.println("The circle with radius "+ r1+"is the greatest!");
            }
            else
            {
           	 System.out.println("The circle with radius "+ r2+"is the greatest!");
            }
            break;
        case 2:
            if(c.perimeter(r1)>c.perimeter(r2))
            {
           	 System.out.println("The circle with radius"+ r1+"is the greatest!");
            }
            else
            {
           	 System.out.println("The circle with radius"+ r2+"is the greatest!");
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
