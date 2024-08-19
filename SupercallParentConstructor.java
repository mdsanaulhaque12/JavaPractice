package superdemo;
class Abc{
    Abc(){
        System.out.println("inside  parent cons Abc");
    }
    public Abc(int n){
        System.out.println("inside parent cons"+n);
    }
}
class Bcd extends Abc{
    Bcd(){
        System.out.println("inside child cons bcd");
    }
    public Bcd(int n){
        super(n);
        System.out.println("inside child constructor");
    }
}
public class SupercallParentConstructor {
    public static void main(String[] args) {
        Bcd obj = new Bcd();
    }
}
