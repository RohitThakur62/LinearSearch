package Array_java;

import java.util.Arrays;

public class Q1ArraySWap {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        System.out.println("Before");
        System.out.println(Arrays.toString(a));
        swap(a,1,2);
    }
    public static void swap(int[] arr,int index,int index2){
        for(int i=0;i<arr.length;i++){
            int temp=arr[index];
            arr[index]=arr[index2];
            arr[index2]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
