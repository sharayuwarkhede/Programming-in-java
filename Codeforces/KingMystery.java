import java.util.Scanner;
public class  KingMystery{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();//taking the number of test cases
        int i,j;
        //for running the code as the numer of test case
        for(int k = 0; k < t; k++){
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a>b){
            i=b;
        }
        else{
            i=a;
        }
        for(j=i; ;j++)//this is important
        {
            if(j % a == j% b){
                System.out.println(j);
                break;
            }
        }
        }
        
    } 
}
