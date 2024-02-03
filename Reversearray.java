// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

public class Reversearray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int start = 0;
        int end = arr.length-1;
        
        while(start<=end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end]=temp;
        start++;
        end--;
 
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" 1");
        }
    }
}
