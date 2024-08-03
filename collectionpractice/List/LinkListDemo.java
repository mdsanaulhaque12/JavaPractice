package collectionpractice.List;

import java.util.*;

public class LinkListDemo {
    public static void main(String[] args) {
        List<String> ll = new LinkedList();
        ll.add("foggi");
        ll.add("oggi");
        ll.add("jiggi");
        ll.add("maggi");
        System.out.println(ll.size());
        System.out.println(ll);
        ListIterator<String> litr = ll.listIterator();

        while(litr.hasNext()){
            String s = litr.next();
            if(s.equals("jiggi")){
                litr.remove();
            }
            if(s.equals("foggi")){
                litr.set("fouj ");
            }

        }System.out.println(ll);

    }
}
