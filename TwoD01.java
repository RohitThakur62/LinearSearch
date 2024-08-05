package Array_java;
class TwoD01{
    public static void main(String arg[]){
        int a[][]={{1,2,3},{5,9,6}};
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+"");
            }
            System.out.println();
        }
    }
}