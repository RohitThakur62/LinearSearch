package Array_java;

public class ArrayMethod{
    void display(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
    public static void main(String arg[]){
        int a[]={1,2,3};
        ArrayMethod m=new ArrayMethod();
        m.display(a);
    }
}
