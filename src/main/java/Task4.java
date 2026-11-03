import jdk.jshell.Snippet;

public class Task4 {
    public static void main(String[] args) {
        String status ="PROCESSING";
        switch (status) {
            case "NEW":
                System.out.println("ORDER RECEIVED");
                break;
            case "PROCESSING":
                System.out.println("ORDER IS BEING PREPARED");
            break;
            case "SHIPPED":
                System.out.println("ORDER IS ON THE WAY");
                break;
            case "DELIVERED":
                System.out.println("ORDER DELIVERED");
                break;
            default:
                System.out.println("UNKNOWN STATUS");



        }
    }
}
