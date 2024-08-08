package sTRING;

public class revStringbycharacter {
    public static void main(String[] args) {
        String str=" this is arun sharma";
        char[] arr=str.toCharArray();
        String s2="";
        for (int i = arr.length-1; i>0; i--) {
            s2+=arr[i];
        }
        System.out.println(s2);
    }
}
