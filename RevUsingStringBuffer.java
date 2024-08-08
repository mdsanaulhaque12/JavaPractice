package sTRING;

public class RevUsingStringBuffer {
    public static void main(String[] args) {
        StringBuffer br =new StringBuffer("hi this is me");
        br=br.reverse();
        System.out.println(br.toString());
    }
}
