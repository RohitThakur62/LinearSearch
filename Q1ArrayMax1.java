package Array_java;

import java.util.Arrays;

public class Q1ArrayMax1 {
    public static void main(String[] args) {
        int[] a={1,2,31,4,5};
        System.out.println("Before");
        System.out.println(Arrays.toString(a));
        int m=max(a);
        System.out.println(m);
    }
    public static int max(int[] arr){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
               max=arr[i];
            }
            
        }
        return max;

    }
}
