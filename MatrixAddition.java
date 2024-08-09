package arrays2d;

import java.util.ArrayList;
import java.util.List;

public class MatrixAddition {
    public static void main(String[] args){

        int[][] ar1 = {
                {1,2,3},
                {2,2,2},
                {6,7,8}
        };

        int[][] ar2 = {
                {4,2,3},
                {2,9,2},
                {6,2,8}
        };

        List l=new ArrayList<>();
        int[][] result =new int[3][3];
        for(int i=0;i<ar1.length;i++){
            for(int j=0;j<ar1[0].length;j++){
                //l.add(ar1[i][j]+ar2[i][j]);
                result[i][j]=ar1[i][j]+ar2[i][j];
            }
        }
        //System.out.println(l);

        for (int i=0;i<result.length;i++){
            for(int j=0;j<result[0].length;j++){
                System.out.print("  "+result[i][j]+"   ");
            }
            System.out.println();
        }

    }
}
