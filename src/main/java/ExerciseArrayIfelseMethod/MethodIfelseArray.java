package ExerciseArrayIfelseMethod;

public class MethodIfelseArray {
    public static void main(String[] args) {
        int [] mynumbers={10,14,20,34,56,61};
        filterAndSum(mynumbers);

    }
    static void filterAndSum(int [] numbers){
        for (int i=0;i<numbers.length;i++){
            if (numbers[i]%2==0){
                System.out.println("ლუწია");
            }
            else {
                System.out.println("კენტია");
            }
        }
    }
}
