import java.util.Scanner;

/**
 *  Main Class
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean validName;

        //First name input
        do {
            System.out.printf("Enter a First Name of User: ");
            String firstName = sc.nextLine();
            validName = RegexCheckingOperations.usernameValidationChecking(firstName);
        }
        while (validName == false);

        //Last name input
        do {
            System.out.printf("Enter a Last Name of User: ");
            String lastName = sc.nextLine();
            validName = RegexCheckingOperations.usernameValidationChecking(lastName);
        }
        while (validName == false);
    }
}
