package Lab7inheritance;
class Vehicle {
    String make;
    String model;
    int year;
    int maximumSpeed;
    public void  drive(){

    }
    public Vehicle(String make,String model,int year,int maximumSpeed){
        this.make=make;
        this.model=model;
        this.year=year;
        this.maximumSpeed=maximumSpeed;


    }
}
class Car extends Vehicle{
    public Car(String make,String model,int year,int maximumSpeed){
        super(make,model,year,maximumSpeed);
    }
    public void  drive(){

        System.out.println(make+" "+model+" "+year+"  car is driving");
    }
}

class Bike extends Vehicle{
    public Bike(String make,String model,int year,int maximumSpeed){
        super(make,model,year,maximumSpeed);
    }
    public void  drive(){
        System.out.println(make+" "+model+" "+year+"  Bike is driving");
    }
}
public class Main1 {
    public static void main(String[] args) {
        Car c= new Car("tesla","s",2024,300);
        c.drive();
        Bike b= new Bike("kawasaki","ninjaz900",2024,300);
        b.drive();
    }
}
