package collectionpractice.List;

public class Student {
    int id;
    String name;
    private int standard;

    public Student(int id ,String name,int standard){
        this.id=id;
        this.name=name;
        this.setStandard(standard);
    }

    @Override
    public String toString(){
        return "id: "+id+"\tname: "+ name+"\tstandard: "+ getStandard() +"\n";
    }

    public int getStandard() {
        return standard;
    }

    public void setStandard(int standard) {
        this.standard = standard;
    }
}
