package Static;

public class StaticDemo1 {
    int stdId;
    String name;

    StaticDemo1(){

    }

    static void display(){
        StaticDemo1 s=new StaticDemo1();
        //System.out.println(stdId);//cannot access directly
        System.out.println(s.stdId);
        System.out.println(s.name);

    }
}
// we cannot access this and super in static ;

//outer class cannot be static