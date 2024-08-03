package arrays;
class Student{
    String name;
    int noOfPages;

    public Student(String name, int noOfPages) {
        this.name = name;
        this.noOfPages = noOfPages;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", noOfPages=" + noOfPages +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoOfPages() {
        return noOfPages;
    }

    public void setNoOfPages(int noOfPages) {
        this.noOfPages = noOfPages;
    }
}
public class StoreObjectInArray {
    public static void main(String[] args) {
        Student[] std = new Student[2];

        std[0]=new Student("abc",40);
        std[1]=new Student("def",50);

        for (int i = 0; i <std.length ; i++) {
            System.out.println(std);
            Student s=std[i];
            System.out.println(s.getName());
            System.out.println(s.getNoOfPages());
        }
    }
}
