package ExerciseArrayIfelseMethod;

public class Skipfifthsymbol {
    public static void main(String[] args) {


        skipTheFifthSymbol("ketikutateladze");


    }
    static void skipTheFifthSymbol(String text2){
        for (int i=0;i<text2.length();i++){

            if (i==5){
                continue;

            }
            System.out.println(text2.charAt(i));



        }


    }
}
