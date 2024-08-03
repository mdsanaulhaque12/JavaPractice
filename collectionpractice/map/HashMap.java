package collectionpractice.map;
import java.util.*;
public class HashMap {
    public static void main(String[] args) {
        Map<Integer,String> m = new java.util.TreeMap(new MyComp());
        m.put(12,"eddducate");
        m.put(2,"scene");
        m.put(202,"gym");
        m.put(30,"damage");
        m.put(25,"song");
        m.put(33,"educate");

        System.out.println(m);
        Collection c =m.keySet();
        System.out.println(c);
        Collection c1 = m.values();
        System.out.println(c1);

        Set s= m.entrySet();
        Iterator itr = s.iterator();

        while(itr.hasNext()){
            Map.Entry me= (Map.Entry) itr.next();
            System.out.println(me.getKey()+"   "+me.getValue());
        }

    }
}

class MyComp implements Comparator{
    @Override

    public int compare(Object o1,Object o2){
        Integer i1=(Integer)o1;
        Integer i2=(Integer)o2;
        return i2.compareTo(i1);
    }
}
