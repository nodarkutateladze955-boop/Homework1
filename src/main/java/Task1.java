public class Task1 {
    public static void main(String[] args) {
        double price=100;


        if (price>=100){
            price=price*0.90;

            System.out.println("თქვენ გეკუთვნით 10% იანი ფასდაკლება" );

        }
        else {
            System.out.println("ვერ სარგებლობთ ფასდაკლებით");
        }
        System.out.println(price);
    }
}
