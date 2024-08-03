package clonabledemo;

class CloneDemo implements Cloneable{
    int a;
    int age;
    CloneDemo(){
    }
    CloneDemo(int a, int age){
        this.age=age;
        this.a=a;
    }

    public static void main(String[] args)throws CloneNotSupportedException {
        CloneDemo t=new CloneDemo(1,25);
        CloneDemo t2=(CloneDemo)t.clone();
    }
}
/*class Test implements Cloneable{
    int a;
    int age;
    Test(){
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    Test(int a,int age){
        this.age=age;
        this.a=a;
    }
}
public class CloneDEMO   {
    public static void main(String[] args)throws CloneNotSupportedException {
        Test t=new Test(1,25);
        Test t2=(Test)t.clone();
    }
}*/
