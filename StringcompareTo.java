package sTRING;

public class StringcompareTo {
        public static void main(String[] args) {
            String str1 = "Apple";
            String str2 = "Banana";
            String str3 = "Apple";
            String str4 = "apple";

            int result1 = str1.compareTo(str2);
            System.out.println("Comparing \"" + str1 + "\" with \"" + str2 + "\": " + result1);
            /*The Unicode value of 'A' is 65.
The Unicode value of 'B' is 66.
Since 'A' < 'B', the method returns a negative integer.
Output: Comparing "Apple" with "Banana": -1*/
            int result2 = str1.compareTo(str3);
            System.out.println("Comparing \"" + str1 + "\" with \"" + str3 + "\": " + result2);

            int result3 = str1.compareTo(str4);
            System.out.println("Comparing \"" + str1 + "\" with \"" + str4 + "\": " + result3);
            /*The Unicode value of 'A' is 65.
            The Unicode value of 'a' is 97.
            Since 'A' < 'a', the method returns a negative integer.
            Output: Comparing "Apple" with "apple": -32 (because 65 - 97 = -32).*/


            String s="arun kumar";
            System.out.println(s.replace(s.substring(0,4),"raj"));
            System.out.println(s);
            s=s+"nina";
            System.out.println(s);
            String s1 = "hello world";
            int index = s1.lastIndexOf('o');
            System.out.println(index);  // Output: 7

            char ch[] ={'a','b'};
            System.out.println(ch);

            char ch1[] = s1.toCharArray();
            System.out.println(ch1);

            String ch2[] =s1.split(" ");
            for (int i = 0; i <ch2.length; i++) {
                System.out.println(ch2[i]);
            }
        }
    }

