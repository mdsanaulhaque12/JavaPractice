package superdemo;

import org.w3c.dom.ls.LSOutput;

class A{
    int no=10;
}
class B extends A{
    int no =20;
    B(int n){
        System.out.println(n);
        System.out.println(this.no);
        System.out.println(super.no);

    }

}
public class SuperDemo {
    public static void main(String[] args) {
    B b1=new B(30);
    }
}
