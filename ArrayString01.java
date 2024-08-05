package Array_java;
import java.util.*;

public class ArrayString01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] arr=new String[4];
        System.out.println("Enter String Element");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextLine();
        }
        System.out.println(Arrays.toString(arr));


    }
}
