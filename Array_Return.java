package Array_java;

public class Array_Return {
     static int[] display(){
        int a[]={1,2,3};
        return a;
     }
     public static void main(String arg[]){
        int x[]=display();
        for(int i=0;i<x.length;i++){
            System.out.println(x[i]);
        }
     }
    }
