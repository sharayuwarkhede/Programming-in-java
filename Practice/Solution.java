import java.util.Scanner;
class Solution {
    public void printNumber(Scanner sc) {
        
        int i = sc.nextInt();
        System.out.println(i);
    }
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    Solution s = new Solution();
    s.printNumber(sc);
}
}
