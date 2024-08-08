package sTRING;

import java.util.ArrayList;
import java.util.*;

public class CountNumberOfWords {
    public static void main(String[] args) {
        String s="   this  is      me hjbsj          hjb hb hgv bj jbh";

       /* String[] s1 =s.split(" ");
        System.out.println("number of words : "+s1.length);*/

        String s2="";
        List<String> slist = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                s2 += s.charAt(i);
            } else if (!s2.isEmpty()) {
                slist.add(s2);
                s2 = "";
            }
        }
        // Add the last word if there is any
        if (!s2.isEmpty()) {
            slist.add(s2);
        }
        System.out.println(slist.size());
    }
}
//maximum occuring character solve