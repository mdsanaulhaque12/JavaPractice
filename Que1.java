package assignmentlab6;
class Vehicle{
    void start(){
        System.out.println("Vehicle started");
    }
}
class Car extends Vehicle{
    @Override
    void start(){
        System.out.println("Car started");
    }
}
class Motorcycle extends Vehicle {
    @Override
    void start(){
        System.out.println("Motorcycle started");
    }
}

class Garage{
    void serviceVehicle(Vehicle vehicle){
        vehicle.start();//calling start method by vehicle reference
        System.out.println("vehicle serviced");
    }
}
public class Que1 {
    public static void main(String[] args) {
        Vehicle v= new Vehicle();
        Car c =new Car();
        c.start();

        Motorcycle m= new Motorcycle();
        m.start();

        Garage g = new Garage();
        g.serviceVehicle(v); //passing object v of vehicle class in argument

    }
}
