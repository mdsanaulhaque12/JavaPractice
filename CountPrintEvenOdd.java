package lab5flowcontrol;

import java.util.Scanner;

public class CountPrintEvenOdd {
    static int countEven=0;
    static int countOdd=0;
    public static void printOddEvenCount(int num){ //count odd /even method
        if(num==-1)return;
        if(num%2==0){
            countEven++;
            System.out.println("even num: "+num+" and even number count is "+countEven);
        }else
        {
            countOdd++;
            System.out.println("odd num:" +num +" and  odd number count is "+countOdd);

        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=1;
        while(i !=-1){
            System.out.println("enter number to check wheather number is odd and even or enter -1 to exit ");
            int num=sc.nextInt();
            if(num==-1){//exit loop condition
                i=num;
            }
            printOddEvenCount(num);//print count of odd or even ...static method directly accessed in static context
        }
    }
}
