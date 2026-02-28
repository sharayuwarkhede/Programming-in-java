import java.util.Scanner;
public class SlidingWindow {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k= sc.nextInt();
        int h[]=new int[n];//assignning the size of array
        int i,sum=0;
        //taking input using for loop
        for(i=0;i<n;i++)
        {
            h[i]=sc.nextInt();
        }
        //calculating sum of first k elements
        for (i=0;i<k;i++)
        {
            sum= sum+h[i];   
        }
        int min= sum;//initialsing this sum as minimum
        int index=0;//initialsing the index
        //sliding window
        for(i=k;i<n;i++)
        {
            sum=sum-h[i-k]+h[i];
            if(sum<min)
            {
                min=sum;
                index=i-k+1;//update index
            }
        }
        System.out.println(index+1);//for 1-based index
}}

