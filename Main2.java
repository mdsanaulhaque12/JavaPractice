package Lab7inheritance;
class Shape{
    void  getArea(){

    }
}
class Circle extends Shape{
    int radius;
    Circle(int radius ){
        this.radius=radius;
    }
    @Override
    void  getArea() {
        System.out.printf("area of circle : %.3f %n ",3.14*radius*radius);
    }
}
class Square extends Shape{
    int length;
    Square(int length){
        this.length=length;
    }

    @Override
    void getArea(){
        System.out.println("area of square : "+length*length);
    }
}

class Rectangle extends Shape{
    int width;
    int height;
    Rectangle(int width,int height){
        this.width=width;
        this.height=height;
    }

    @Override
    void getArea(){
        System.out.println("area of rectangle :"+ 2*(width+height));
    }
}
public class Main2 {
    public static void main(String[] args) {
        Shape circle=new Circle(3);
        circle.getArea();

        Shape square =new Square(4);
        square.getArea();

        Shape Rectangle = new Rectangle(3,4);
        Rectangle.getArea();
    }
}
