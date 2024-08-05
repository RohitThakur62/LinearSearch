package Array_java;

import java.util.Arrays;

public class Q1ArrayMax {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        System.out.println("Before");
        System.out.println(Arrays.toString(a));
        max(a);
    }
    public static void max(int[] arr){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
               max=arr[i];
            }
            
        }
        System.out.println(max);

    }
}
