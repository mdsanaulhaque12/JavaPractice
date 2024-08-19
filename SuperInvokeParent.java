package superdemo;
class D{
    void show(){
        System.out.println("parent method show called");
    }
}
class E extends D{
    @Override
    void show(){
        System.out.println("child method show called");
    }
    void m1(){
        System.out.println("in child class m1 method");
        super.show();
        show();
    }
}
public class SuperInvokeParent {
    public static void main(String[] args) {
        E obj = new E();
        obj.m1();

    }
}
