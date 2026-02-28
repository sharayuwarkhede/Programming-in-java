package Codeforces;
public class Prefixsum {
public static void main(String[] args) {
int[] arr = {11, -2, 0, 16, 5};
int n = arr.length;
int[] prefix = new int[n];
// Brute force prefix sum construction
for (int i = 0; i < n; i++) {
int sum = 0;
for (int j = 0; j <= i; j++) {
sum = sum + arr[j];
}
prefix[i] = sum;
}
System.out.println("Original Array:");
for (int num : arr) {
System.out.print(num + " ");
}
System.out.println("\n\nPrefix Sum Array (Brute Force):");
for (int num : prefix) {
System.out.print(num + " ");
}
}
}public class Prefixsum {
    
}
