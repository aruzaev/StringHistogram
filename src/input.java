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

    }
}
