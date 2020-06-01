import java.util.*;

public class input {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Provide a letter: ");
        String userInput = scan.nextLine();
        while (!userInput.matches("[a-zA-Z]{1}")) {
            System.out.println("Please enter a single letter only.");
            userInput = scan.nextLine();
        }
        char[] confirm = new char[4];
        confirm[0] = 'Y';
        confirm[1] = 'N';
        confirm[2] = 'y';
        confirm[3] = 'n';

        System.out.println("Your input is " + userInput + " confirm? (Y/N)");
        char userConfirmation = scan.next().charAt(0);
        if (userConfirmation != )
    }
}
