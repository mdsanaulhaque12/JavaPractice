package collectionpractice.set;

import java.util.*;

public class TreesetDemo2 {
    public static void main(String[] args) {
        Set<Employee> s = new TreeSet(new NameComp());
        s.add(new Employee(1,"miraj",56000));
        s.add(new Employee(2,"raju",6000));
        s.add(new Employee(5,"aaj",5000));
        s.add(new Employee(3,"sanju",776000));
        s.add(new Employee(4,"kajal",58000));

        Iterator<Employee> itr = s.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println( "________________________");
        Set<Employee> s2 = new TreeSet(new SalaryCompDesc());
        s2.add(new Employee(1,"miraj",6000));
        s2.add(new Employee(2,"raju",5600));
        s2.add(new Employee(5,"aaj",56000));
        s2.add(new Employee(3,"sanju",66666000));
        s2.add(new Employee(4,"kajal",11000));


        Iterator<Employee> itr2 = s2.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }
    }
}
class NameComp implements Comparator<Employee>{

    @Override
    public int compare(Employee e1,Employee e2){
        return e1.getName().compareTo(e2.getName());//name ascending
    }


}
class SalaryCompDesc implements Comparator<Employee>{
    @Override
    public int compare(Employee e1,Employee e2){
       if(e2.getSalary()>e1.getSalary()){
           return 1;
       }
       else return -1;
    }
}