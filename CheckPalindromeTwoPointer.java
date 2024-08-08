package sTRING;

public class CheckPalindromeTwoPointer {
    public static void main(String[] args) {
        String s ="Racecar";
        s=s.toLowerCase();
        int i=0,j=s.length()-1;
        boolean isPalindrome=true;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                isPalindrome=false;
                break;
            }
            i++;
            j--;
        }
        System.out.println(isPalindrome);
    }
}
