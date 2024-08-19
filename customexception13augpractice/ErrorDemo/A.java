package ErrorDemo;

import java.util.ArrayList;

public class A {
    public static void main(String[] args) {
        ArrayList<Byte[]> al = new ArrayList<>();

        while(true){
            Byte[] b= new Byte[1024*1024];
            al.add(b);
        }
    }
}
