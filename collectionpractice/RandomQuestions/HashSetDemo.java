package collectionpractice.RandomQuestions;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> hs=new HashSet<>();
        hs.add(5);
        hs.add(10);
        hs.add(15);
        hs.add(20);
        hs.add(25);

        System.out.println(hs);
        System.out.println("is it set contains 10: "+hs.contains(10));
        hs.remove(15);
        System.out.println(hs);
        System.out.println(hs.size());

    }
}
