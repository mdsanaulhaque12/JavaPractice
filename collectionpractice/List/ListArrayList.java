package collectionpractice.List;

import java.util.ArrayList;
import java.util.*;
public class ListArrayList {
    public static void main(String... args){
        List al = new ArrayList();
        al.add(1);
        al.add("i am string");
        al.add('c');
        al.add(4.56f);
        al.add(true);
        al.add(1);//duplicate allowed in array list and insertion order is kept


        System.out.println(al);
        System.out.println(al.size());


        al.remove(3);//4.56 removed
        System.out.println(al);
        System.out.println(al.size());


        List<Integer> al2 = new ArrayList();//generics  this list can hold only integer
        al2.add(12);
        al2.add(333);
        al2.add(1);

        Collections.sort(al2);//collection class method


        System.out.println(al2);

        al.addAll(al2);

        for (Object obj:al
             ) {
            System.out.print(obj+"  ");
        }

        Iterator itr = al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
