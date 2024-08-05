package Array_java;
import java.util.*;

public class Array09Input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[4];
        System.out.println("Enter");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Array are");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    
}
