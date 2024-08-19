package customexception13augpractice;

import java.util.Scanner;
public class Main {
    static int checkinputnumber(int a) throws checkedcustomexception {

        if (a > 100) {
            throw new checkedcustomexception("input number less than 100");
        } else {
            return a;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter int");
        int a = sc.nextInt();
        try {
            checkinputnumber(a);
        } catch (checkedcustomexception e) {
            e.printStackTrace();
        }
        /*checkinputnumber(a);java: unreported exception customexception13augpractice.
            checkedcustomexception; must be caught or declared to be thrown*/
        System.out.println("another code");
    }
}