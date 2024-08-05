package Array_java;

import java.util.*;
public class ArrayTwoD01 {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter row");
            int r=sc.nextInt();
            System.out.println("Enter colummn");
            int c=sc.nextInt();
            int[][] arr=new int[r][c];
            System.out.println("Enter Array Element");
            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    arr[i][j]=sc.nextInt();
                }
            }
            System.out.println("Array are");
            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    System.out.print(arr[i][j]);
                }
                System.out.println();
            }
        }
}
