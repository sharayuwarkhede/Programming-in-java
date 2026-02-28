//code to get the unit digit of the nth power of 1378
import java.util.Scanner;
public class Arpas {
    public static void main(String args[]){
        int n;
        Scanner sc =new Scanner(System.in);
        n = sc.nextInt();
        //using modulo
        if(n%4==1)
        {
            System.out.println("8");
        }
        else if(n%4==2){
            System.out.println("4");
        }
        else if(n%4==3){
            System.out.println("2");
        }
        //special case for zero
        else if(n==0){
             System.out.println("1");
        }
        else if(n%4==0)
        {  
            System.out.println("6");
        }
    }
    
}
