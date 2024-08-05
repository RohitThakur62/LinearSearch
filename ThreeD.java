package Array_java;

public class ThreeD {
    public static void main(String arg[]){
        int[][][] a={{{1,2,3},{11,22,33},{23,45,67}}};
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                for(int k=0;k<a[i][j].length;k++){
                    System.out.print(a[i][j][k]+" ");
                }
                System.out.println();
            }
        }
    }
}
