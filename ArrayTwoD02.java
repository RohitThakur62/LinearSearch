package Array_java;

public class ArrayTwoD02 {
    public static void main(String[] args) {
        int[][] a={{1,2,3},{1,2,3,4},{8,9,6,6}};
        for(int r=0;r<a.length;r++){
            for(int c=0;c<a[r].length;c++){
                System.out.print(a[r][c]);
            }
            System.out.println();
        }
        
    }
}
