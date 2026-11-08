package ExerciseArrayIfelseMethod;

public class Overloading {
    public static void main(String[] args) {
        sum(5,11);
        sum(1,4,3);

    }
    static void sum(int x,int y){
        System.out.println(x+y);
    }
    static void sum(int t,int u,int x){
        System.out.println(t*u+x);
    }
}
