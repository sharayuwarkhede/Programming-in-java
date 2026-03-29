import java.util.Scanner;
class Complex{
    float real,img,r,i;
    Complex()//deafault constructor
    {
       
    }
    Complex(float a ,float b){
        real = a;
        img = b;
    }
    void add(Complex c1,Complex c2){
         r = c1.real + c2.real;
         i = c1.img + c2.img;
         System.out.println("Addition is:"+r+"+"+i+"i");
    }
    void subtract(Complex c1,Complex c2){
         r = c1.real - c2.real;
         i = c1.img - c2.img;
         System.out.println("Subtraction is:"+r+"+"+i+"i");
    }
    void multiplication(Complex c1,Complex c2){
         r = (c1.real * c2.real) -(c1.img * c2.img);
         i = (c1.real * c2.img) + (c1.img * c2.real);
         System.out.println("Multiplication is:"+r+"+"+i+"i");
    }
     void division(Complex c1,Complex c2){
        float d = (c2.real*c2.real)+(c2.img*c2.img);
        r = (c1.real * c2.real) + (c1.img * c2.img)/d;
        i = (c1.img * c2.real) - (c1.real * c2.img)/d;
         System.out.println("Division is:"+r+"+"+i+"i");
    }
}

public class Assignment5{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("---Enter the complex number---");
        System.out.print("Enter the real part of 1st complex number:");
        float r1 = sc.nextFloat();
        System.out.print("Enter the imaginary part of 1st complex number:");
        float i1 = sc.nextFloat();
        System.out.print("Enter the real part of 2nd complex number:");
        float r2 = sc.nextFloat();
        System.out.print("Enter the imaginary part of 2nd complex number:");
        float i2 = sc.nextFloat();
        Complex c1 = new Complex (r1,i1);
        Complex c2 = new Complex (r2,i2);
        Complex o = new Complex();
        int ch=0;
        while(ch!=5){
            System.out.println("----Choose Operation----");
            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            ch = sc.nextInt();
            switch(ch){
                case 1:
                    o.add(c1,c2);
                    break;
                case 2:
                    o.subtract(c1,c2);
                    break;
                case 3:
                    o.multiplication(c1,c2);
                    break;
                case 4:
                    o.division(c1,c2);
                    break;
                default:
                    System.out.println("Invalid Choice");   
        }
        }
    }
}
