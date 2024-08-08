package sTRING;

public class REVstring3 {
    public static void main(String[] args) {
        String s1= "hi this is arun sharma";
        int n=s1.length();
        String s2="";
        for (int i = n-1; i >=0 ; i--) {
            s2=s2+ s1.charAt(i);
        }
        System.out.println(s2);
    }
}
