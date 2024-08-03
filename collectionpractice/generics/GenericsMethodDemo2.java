package collectionpractice.generics;
import java.util.*;
abstract class Shapes{
    abstract void draw();
}
class Rectangle extends Shapes{
    @Override
    void draw() {
        System.out.println("DRAWING RECTANGLE");
    }
}
class Circle extends Shapes{
    @Override
    public void draw(){
        System.out.println("Drawing circle");
    }
}
public class GenericsMethodDemo2 {
    // ?is upper bound wildcard
    public static void drawShapes(List<? extends Shapes> list){
        for (Shapes s: list) {
            s.draw();
        }
    }

    public static void main(String[] args) {
        List<Shapes> list1=new ArrayList<>();
        list1.add(new Rectangle());
        list1.add(new Circle());
        drawShapes(list1);
    }
}
