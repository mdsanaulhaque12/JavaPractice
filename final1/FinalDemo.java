package final1;
class A{
    final void  show(){
        System.out.println(" class A final  method");
    }
}
public class FinalDemo extends A {

    // final void show(){
      //  System.out.println("override");
    //} // cannot override final method

    final void  prnt(){
        System.out.println("final overload ");
    }
    final void  prnt(int a){
        System.out.println("final overload"+a);
    }
    public static void main(String[] args) {
        FinalDemo f= new FinalDemo();
        f.prnt();
        f.prnt(1);
        f.show();

    }
}
