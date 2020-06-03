import java.util.*;

public class input {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int totalValues = 0;
        String userNumber = "";

        while (userNumber.equals("")) {
            System.out.println("Provide a number from 1-9: ");
            userNumber = scan.nextLine();
            if (!userNumber.matches("\\d")) {
                System.out.println("Please input a number from 1-9");
                userNumber = "";
            }
        }

        System.out.println("Your input is " + userNumber);

    }
}