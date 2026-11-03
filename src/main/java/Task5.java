public class Task5 {
    public static void main(String[] args) {
        String username="nodarkutateladzee1";

        int raodenoba = 0;

                for (int i = 0; i < username.length(); i++) {
                    char aso = username.charAt(i);

                    if (aso == 'o' || aso == 'a' || aso == 'u' || aso == 'e' || aso == 'i') {
                        raodenoba++;
                    }
                }


                System.out.println("ხმოვანი ასოების რაოდენობა: " + raodenoba);
                System.out.println("სტრინგის სიგრძე: " + username.length());

                if (username.length() % 2 == 0) {
                    System.out.println("ლუწი");
                } else {
                    System.out.println("კენტი");
                }
            }
        }







