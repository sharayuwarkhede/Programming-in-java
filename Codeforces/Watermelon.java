package Codeforces;
import java.util.Scanner;
public class Watermelon {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int w = sc.nextInt();
        if(w==2){
            System.out.println("No");
        }
        else if(w%2 ==0){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
        sc.close();

    }
    

}
