package throwss;

import java.util.Scanner;

public class Demo1 {
    void check(int a) throws Exception {
            if (a == 0) {
                throw new Exception("Input cannot be zero");
            }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        Demo1 demo = new Demo1();
        try {
            demo.check(a);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("other codes");
    }
}