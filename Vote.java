package Exception;

import java.util.Scanner;

class VoteAge extends Exception{
    public VoteAge(String message){
            super(message);
    }
}
public class Vote {
    public static void main(String[] args) {

        int age=17;
        try {
            if (age < 18) {
                throw new VoteAge("age is less than 18");
            }else{System.out.println(age);}
        } catch(VoteAge e){e.printStackTrace();}


        System.out.println("other code");

    }
}
