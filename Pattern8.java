package patternquestion;

public class Pattern8 {
    public static void main(String[] args) {
        int col=9;
        int row=5;
        for(int i=0;i<row;i++){
            for(int j=0;j<(col/2)-i;j++){
                    System.out.print("  ");
            }
            for(int k=0;k<5;k++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

}
