package Array_java;
import java.util.*;

public class ArrayFunction04 {
    public static int[] change(){
        int[] arr={1,2,3,4};
        return arr;

    }
    public static void main(String[] args) {
        int[] a=change();
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]);
        }
    }
}
