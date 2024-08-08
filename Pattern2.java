package patternquestion;

/*

 *
 ***
 *****
 *******

* */

public class Pattern2 {
    public static void main(String[] args){
        int k=0;
        for(int i=1;i<5;i++){
            for(int j=0;j<i+k;j++){
                System.out.print("*");
            }
            System.out.println();
            k++;
        }
    }
}
