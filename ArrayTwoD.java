package Array_java;

public class ArrayTwoD {
    public static void main(String[] args) {
        int[][] arr={{1,3,4},{1,2,3,7}};
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        System.out.println(arr[0].length);//1,3,4
        System.out.println(arr[1].length);//1,2,3,7
    }
}
