package Array_java;
import java.util.*;

public class ArrayFunction02 {
    public static void change(int[] arr){
        arr[2]=90;
        System.out.println("After"+Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] a={1,2,3,4};
        System.out.println("Before"+Arrays.toString(a));
        change(a);
    }
}
