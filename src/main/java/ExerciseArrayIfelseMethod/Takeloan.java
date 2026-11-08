package ExerciseArrayIfelseMethod;

public class Takeloan {
    public static void main(String[] args) {
        takeALoan(23);

    }
    static void takeALoan(int age){
        if (age < 20){
            System.out.println("20 წლამდე სესხის გაცემა არ არის შესაძლებელი");}
        else if (age >= 20 && age <= 65) {
            System.out.println("თქვენ შეგიძლიათ აიღოთ სესხი");}
        else {
            System.out.println("თქვენ ვერ აიღებთ სესხს, რადგან ხართ 65 წელზე ზევით"); }}
}
