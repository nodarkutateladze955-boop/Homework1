import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        String username="NODARKUTATELADZE1";
        String password="Nodo***";

        Scanner scanner=new Scanner(System.in);
        System.out.println("შეიყვანეთ USERNAME");

        String username2=scanner.nextLine();
        System.out.println("შეიყვანეთ PASSWORD");
        String password2=scanner.nextLine();

        if (username.equals(username2)&&password.equals(password2)) {
            System.out.println("Login successful");
        }
        else {
            System.out.println("Invalid username or password");
        }
        scanner.close();

    }
}
