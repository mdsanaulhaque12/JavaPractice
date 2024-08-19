package Static;

//public static class A {//oter class cannot be static

public class Outer{
     int a=10;
     static int b=20;
     private int c=30;
     void show(){
         System.out.println(a);
     }

     class Inner{
         void showInner(){
             System.out.println(a);
             System.out.println(b);
             System.out.println(c);
         }

    }
    public static void main(String[] args) {
    Outer outer=new Outer();
    Outer.Inner inner= outer.new Inner();
    inner.showInner();
    }
}
