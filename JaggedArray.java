package Array_java;

public class JaggedArray {
    public static void main(String arg[]){
        int a[][]=new int[2][];
        a[0]=new int[]{1,2,3};
        a[1]=new int[]{12,1};
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
