package collectionpractice.RandomQuestions;

import java.util.ArrayList;
import java.util.*;

class Book{
    String bookName;
    int price;

    Book(String bookName,int price){
        this.bookName=bookName;
        this.price=price;

    }
    public String toString(){
        return "book name : "+bookName+" price : "+price+" ";
    }


}
public class BookMain {
    public static void main(String[] args) {
        ArrayList<Book> al = new ArrayList<>();

        al.add(new Book("science",200));
        al.add(new Book("english",200));
        al.add(new Book("hindi",200));

        ListIterator itr=  al.listIterator();
            while(itr.hasNext()){
                Book b1=(Book)(itr.next());
                System.out.println(b1.bookName+ " "+ b1.price);
            }

        for (Book b:al){
            System.out.println(b.bookName+" "+b.price);
        }
        for (Book b:al){
            System.out.println(b);
        }

    }
}
