package labExceptionalHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter integer");
        try {
            int a = sc.nextInt();
        }catch(InputMismatchException e){
            e.printStackTrace();
        }
        sc.nextLine();
        System.out.println("enter character");
        char a= sc.next().charAt(0);
    }
}
