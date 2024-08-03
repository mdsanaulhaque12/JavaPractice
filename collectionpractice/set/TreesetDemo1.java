package collectionpractice.set;

import java.util.*;

public class TreesetDemo1 {

    public static void main(String[] args) {
        Integer a = 2,b=5;
        System.out.println(a.compareTo(b));
        System.out.println(b.compareTo(a));

        String ab="ajax";
        String ac="bjaxx";
        System.out.println(ab.compareTo(ac));
        System.out.println(ac.compareTo(ab));

        Set<Integer> ts = new TreeSet(new MyComp());
        ts.add(2);
        ts.add(27);
        ts.add(22);
        ts.add(12);
        ts.add(92);
        ts.add(22);

        System.out.println(ts);
    }

}
class  MyComp implements Comparator<Integer>{
    @Override
    public int compare(Integer i,Integer j){
        return j.compareTo(i);//descending order
    }
}
