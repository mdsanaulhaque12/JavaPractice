package collectionpractice.List;

import java.util.*;

public class ListDemo {
    public static void main(String[] args) {
        List<Student> al = new ArrayList();
        al.add(new Student(1, "raj", 5));
        al.add(new Student(5, "gcr", 8));

        System.out.println(al);

        Iterator itr = al.iterator();

        while (itr.hasNext()) {
            Student s1 = (Student) itr.next();
            System.out.println(s1.id + "  " + s1.name);


        }
    }

}
