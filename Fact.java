package lab5flowcontrol;

public class Fact {
    public int fact(int n){
        if(n==0)return 1;
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        Fact f=new Fact();
        System.out.println(f.fact(4));
    }
}
