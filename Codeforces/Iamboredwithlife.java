import java.util.Scanner;
public class Iamboredwithlife {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int f= 1,i=1;
        if(a>=b){
           while(i<=b){
               f = f * i;
               i++;             
           }
           System.out.println(f);        
        }
        else{
           while(i<=a){
               f = f * i;
               i++;             
           }
           System.out.println(f);        
        } 
        }
    }
    

