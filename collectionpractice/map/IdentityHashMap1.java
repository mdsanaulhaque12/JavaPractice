package collectionpractice.map;

import java.util.*;


public class IdentityHashMap1 {
        public static void main(String[] args) {
            Map<Integer, String> map = new IdentityHashMap<>();
            map.put(new Integer(10), "Geeks");
            map.put(new Integer(20), "for");
            map.put(new Integer(10), "geeks");
            System.out.println("identityHashMap content: " + map);

    }
}
