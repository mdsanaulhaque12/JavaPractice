package patternquestion;

public class Pattern7 {
    public static void main(String [] args) {
        int num=0;
        for (int i = 1; i <= 5; i++) {
            num=i%2;
            for (int j = 0; j < i; j++) {
                System.out.print(num);
                num=1-num;
            }
            System.out.println();
        }
    }
}
