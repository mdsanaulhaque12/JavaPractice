package arrays2d;

public class ZigzagLeftToRightToLeft2darray {
    public static void main(String[] args) {
        int col=5;
        int rows=0;
        int num=1;
        int[][] arr= new int[5][5];
        while(rows<5) {
            for (int i = 0; i < col; i++) {
                arr[rows][i] = num;
                num++;
            }
            rows++;

            if(rows<5) {
                for (int i = col- 1; i >=0; i--) {
                    arr[rows][i] = num;
                    num++;
                }
                rows++;
            }

        }

        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print("  "+arr[i][j]+"   ");
            }
            System.out.println();
        }
    }

}
