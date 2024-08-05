package Array_java;
import java.util.*;

public class ArrayFunction03 {
    public static void min(int[] arr){
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[0]>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("Minimum elemnt is"+min);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a=new int[4];
        System.out.println("Enter Array");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Array are");
        System.out.println(Arrays.toString(a));
        min(a);
    }
    
}
