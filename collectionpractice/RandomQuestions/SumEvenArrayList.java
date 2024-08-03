package collectionpractice.RandomQuestions;

import java.util.ArrayList;
import java.util.Iterator;

public class SumEvenArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();

        for (int i = 1; i <=10 ; i++) {
            int a=1+(int)(Math.random()*100);
            al.add(a);
        }
        for (Integer a:al) {
            System.out.print(a+" ");
        }

        int sumOfEven=0;
        Iterator<Integer> itr = al.iterator();
        while(itr.hasNext()){
            int a= itr.next();;
            if(a%2==0){
               sumOfEven+= a;
            }
        }
        System.out.println("\n"+sumOfEven);

    }
}
