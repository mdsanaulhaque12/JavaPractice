package Static;

public class StaticInner {
    int a;
    static int b;
    private int c;
    private static int d;
    static class Inner {
        void show(){
            System.out.println("inner class");
            //System.out.println(a);
            System.out.println(b);
            //System.out.println(c);
            System.out.println(d);
        }
    }

    public static void main(String[] args) {
        StaticInner.Inner s = new StaticInner.Inner();
        s.show();
    }
}
