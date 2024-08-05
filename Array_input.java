package Array_java;
import java.util.*;
class Test{
    public static void main(String arg[]){
        System.out.print("Enter size");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        System.out.println("size="+size);
        int a[]=new int[size];
        System.out.println("Enter element:");
        for(int i=0;i<=size;i++){
            a[i]=sc.nextInt();
            System.out.println(a[i]);

        }
        System.out.println("elements are:");
        for(int i=0;i<=size;i++){
            System.out.println(a[i]);
        }
    }
}
