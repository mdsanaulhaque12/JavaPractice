package sTRING;

public class Stringrev {
    public static void main(String[] args) {
        String str = new String("this is my demo");

        String[] c= (str.split(" "));
        for (int i = c.length-1; i >=0 ; i--) {
            System.out.print(c[i]+" ");
        }

    }
}
