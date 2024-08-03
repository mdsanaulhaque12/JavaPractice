package collectionpractice.generics;
class MyGen<T>{
    T obj;
    void add(T obj){
        this.obj=obj;
    }
    T get(){
        return obj;
    }
}
public class GenericDemo2 {
    public static void main(String[] args) {
        MyGen<Integer> m1= new MyGen();
        m1.add(34);
        System.out.println(m1.get());

        MyGen<String> m2=new MyGen<>();
        m2.add("hello");
        System.out.println(m2.get());
    }
}
