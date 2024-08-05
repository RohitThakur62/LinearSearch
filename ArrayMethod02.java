package Array_java;

public class ArrayMethod02 {
    public static void display(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
    public static void main(String arg[]){
        int a[]=new int[]{1,2,3};
        display(a);
    }
}
