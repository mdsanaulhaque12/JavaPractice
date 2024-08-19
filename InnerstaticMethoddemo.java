package Static;

public class InnerstaticMethoddemo {
    int a;
    static int b;
    private int c;
    static class inner {
        static void show(){
            //System.out.println("static inner method"+a);
            System.out.println("static inner method"+b);
            //System.out.println("static inner method"+c);
        }
    }

    public static void main(String[] args) {
        InnerstaticMethoddemo.inner.show();
    }
}
