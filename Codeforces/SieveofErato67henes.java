import java.util.Scanner;
public class SieveofErato67henes {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int i,c=0;
        for(int k=0;k<t;k++){
            int n = sc.nextInt();
            //int a[];
            int a[]= new int [n];
            for(i=0;i<n;i++){
                 a[i] = sc.nextInt();
            }
            boolean found=false;
            for(i=0;i<n;i++){
                for(int j=(i+1);j<(n-i);j++){
                    if(a[i]*a[j]==67){
                        found=true;
                        break;   
                    }
                    } 
                if(found) 
                    break; 
                else if(a[i]==67)
                {
                  found = true;
                }
                }
            if(found){
                System.out.println("YES");
            }
            else{
                 System.out.println("NO");
            }   
        }
        
    }    
}
