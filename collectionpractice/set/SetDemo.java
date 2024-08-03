package collectionpractice.set;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
        Set hs = new HashSet();
        hs.add(2);
        hs.add(true);
        hs.add(2);//duplicate will not be allowed and simply ignored.
        hs.add("gch");
        hs.add('y');

        System.out.println(hs);

        Iterator itr = hs.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
