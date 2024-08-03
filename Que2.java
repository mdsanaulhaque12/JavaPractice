package assignmentlab6;
class Student {
    String name;
    int age;
    String department;
     Student(){
         name="Unknown";
         age=20;
         department="Unassigned";
     }
     Student(String name,int age){
         this.name=name;
         this.age=age;
         department="IT";
     }
    Student(String name,int age,String department){
        this.name=name;
        this.age=age;
        this.department=department;
    }
}
public class Que2 {
    public static void main(String[] args) {
        Student s1=new Student();
        System.out.println("name : "+s1.name +"   age: "+s1.age+" department: "+s1.department);

        Student s2= new Student("raj",20);
        System.out.println("name : "+s2.name +"  age: "+s2.age+" department: "+s2.department);

         Student s3= new Student("syam",22,"Quality Assuarance");
        System.out.println("name : "+s3.name +"  age: "+s3.age+" department: "+s3.department);


    }
}
