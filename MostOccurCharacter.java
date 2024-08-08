package sTRING;

public class MostOccurCharacter {
    public static void main(String[] args) {
        String str="test output";
        str=str.toLowerCase();
        str=str.replaceAll("\\s+","");

       int [] chCountArray = new int[256];//lets each index represents character ascii value in integer

        char maxChar='\0'; //lets max count character as null

        char[] chArray= str.toCharArray();

        for (char ch :  chArray){
            // System.out.println((int)ch);
            chCountArray[ch]++;
            if(chCountArray[ch] >chCountArray[maxChar]){
                maxChar=ch;
            }
        }
        System.out.println(maxChar);


    }
}
