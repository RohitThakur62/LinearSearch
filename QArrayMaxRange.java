package Array_java;

import java.util.Arrays;

public class QArrayMaxRange {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        System.out.println("Before");
        System.out.println(Arrays.toString(a));
        int m=max(a,1,4);
        System.out.println(m);
    }
    public static int max(int[] arr,int s,int e){
        int max=arr[s];
        for(int i=s;i<=e;i++){
            if(arr[i]>max){
               max=arr[i];
            }
            
        }
        return max;

    }
}
