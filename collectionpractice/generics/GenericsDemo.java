package collectionpractice.generics;
import java.util.*;
public class GenericsDemo {
    public static void main(String[] args) {

        List<String> al = new  ArrayList();
        al.add("dont give up");
        al.add("there is still hope");
        al.add("you will get it just work hard");
       // al.add(1);//compile time error

        Iterator<String> itr = al.iterator();
        while(itr.hasNext()){
            String str = itr.next();
            System.out.println(str);
        }
    }
}
