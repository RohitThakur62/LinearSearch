package Array_java;

import java.util.Arrays;
public class Reverse{
    public static void main(String arg[]){
        int[] a={1,2,3,4,5};
        System.out.println(Arrays.toString(a));
        reverse(a);
        System.out.println(Arrays.toString(a));
    }
    public static void reverse(int[] arr){
        int s=0;
        int e=arr.length-1;
        while(s<e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
        
    }
}