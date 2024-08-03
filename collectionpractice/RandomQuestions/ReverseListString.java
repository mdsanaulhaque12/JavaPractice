package collectionpractice.RandomQuestions;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Stack;

public class ReverseListString {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList();
        al.add("hi");
        al.add("my");
        al.add("name");
        al.add("sanaul");
        System.out.println("original list "+al);
        Stack<String> s=new Stack();
        ListIterator<String> itr = al.listIterator();
        while(itr.hasNext()){
            String a= itr.next();
            s.push(a);
            itr.remove();
        }
        int sizeOfStack=s.size();
        for (int i = 0; i <sizeOfStack ; i++) {
            al.add(s.pop());
        }

        System.out.println("reversed list : "+al);
    }
}
