package ExerciseArrayIfelseMethod;

public class IfelseArrayGemini {
    public static void main(String[] args) {
        int [] rickhvebi={-17,20,40,50,-10,1};
        for (int i=0;i<rickhvebi.length;i++){
            if (rickhvebi[i]>0){
                System.out.println("დადებითი რიცხვი" + rickhvebi[i]);
            }
            else {
                System.out.println("უარყოფითი რიცხვი" + rickhvebi[i]);
            }
        }

    }
}
