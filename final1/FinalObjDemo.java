package final1;

import java.io.Console;

public  class FinalObjDemo {
    void show(FinalObjDemo f){
        System.out.println("show");
    }
    public static void main(String[] args) {
        final FinalObjDemo  f1= new FinalObjDemo();
       // f1 = new FinalObjDemo();//cannot refer to other object

    }
}
