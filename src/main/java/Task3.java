public class Task3 {
    public static void main(String[] args) {
        int [] testResult={1,0,1,1,0};
        int passdCount=0;
        int failedCount=0;

        for (int i=0;i<testResult.length;i++){
           if (testResult[i]==1){
               passdCount++;
           }
           else {
               failedCount++;
           }

            }
        System.out.println("passed test case count is "+passdCount);
        System.out.println("failed test case count is "+failedCount);
        }

        }


