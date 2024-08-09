package arrays2d;

import java.util.Arrays;

public class Spiral2dArray {
    public static void main(String[] args) {
        int num=1;
        int N =5;
        int left=0;
        int right = N-1;
        int top=0;
        int bottom=N-1;
        int[][]arr=new int[5][5];

        while(left<=right && top<=bottom){

            for(int i=left;i<=right;i++){
                arr[top][i]=num;
                num++;
            }
            top++;
            for(int i=top;i<=bottom;i++){
                arr[i][right]=num;
                num++;
            }
            right--;

            for(int i=right;i>=left;i--){
                arr[bottom][i]=num;
                num++;
            }
            bottom--;

            for(int i=bottom;i>=top;i--){
                arr[i][left]=num;
                num++;
            }
            left++;

        }
        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print("  "+arr[i][j]+"   ");
            }
            System.out.println();
        }
    }

}
