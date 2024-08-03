package lab5flowcontrol;
import java.util.Scanner;
public class ArmstrongMain {
    public int cube(int n) {
        int num = 1;
        for (int i = 0; i < 3; i++) {// Using loop to calculate the cube
            num *= n;
        }
        return num;  // Return the cube value
    }

    public int calcArmstrong(int i) {//calculating for armstrong number with help of  cube method
        int num = i;
        int armstrongNum = 0;
        while (num != 0) {
            int digits = num % 10;
            armstrongNum += cube(digits);
            num = num / 10;
        }
        return armstrongNum;
    }


    //checking if number is armstrong or not and printing using loop
    public void printArmstrongNumber(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (i == calcArmstrong(i)) {
                System.out.println("Number is Armstrong: " + i);
            }
        }
    }

    public static void main(String[] args) {
        ArmstrongMain am = new ArmstrongMain();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter start and end");
        int start=sc.nextInt();
        int end=sc.nextInt();

        am.printArmstrongNumber(start,end);
    }
}

