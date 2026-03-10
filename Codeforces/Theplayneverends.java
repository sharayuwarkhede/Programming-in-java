import java.util.Scanner;
public class Theplayneverends {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
       
        for(int i=0;i<t;i++){
             int k = sc.nextInt();
             if((k+2)%3==0){
                System.out.println("yes");
        }
            else{
                System.out.println("no");
            }   
        }
       

    } 
}