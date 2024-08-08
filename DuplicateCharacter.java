package sTRING;

public class DuplicateCharacter {
    public static void main(String[] args) {
        String str="ababdbaac";
        int [] ch = new int[256];

        for (int i=0;i<str.length();i++) {
            char c=str.charAt(i);
            //System.out.println(c);
            ch[c]++;
        }
        for (int i=0;i<256;i++)
            if(ch[i]>1){
                System.out.println((char)i+" count"+ch[i]);
            }
        }
    }

