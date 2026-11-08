package ExerciseArrayIfelseMethod;

public class MethodArrayIfelse2 {
    public static void main(String[] args) {
        int [] rickvebi ={15,50,60,61,50,49};
        mtelirickhvebi(rickvebi);

    }
    static void mtelirickhvebi (int [] numbers){
        for (int i=0;i<numbers.length;i++){
            if (numbers[i]>=50){
                System.out.println("ხარ დიდი ან ტოლი 50 ის");

            }
            else {
                System.out.println("ხარ 50 ზე ნაკლების");
            }
        }
    }
}
