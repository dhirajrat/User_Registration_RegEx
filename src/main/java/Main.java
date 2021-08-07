import java.util.Scanner;

/**
 *  Main Class
 */
public class Main {
    public static void main(String[] args) throws InvalidUserInputException {
        Scanner sc = new Scanner(System.in);
        Scanner ch = new Scanner(System.in);
        boolean validName;

        int maintain = 0;

        while(maintain == 0) {
            System.out.println("Enter a choice to validate input of :\n1.FirstName 2.LastName 3.E-mail 4.PhoneNumber 5.Password 6.EXIT");
            int choice = ch.nextInt();
            switch(choice) {
                case 1:
                    //First name input
                    do {
                        System.out.printf("Enter a First Name of User: ");
                        String firstName = sc.nextLine();
                        validName = RegexCheckingOperations.usernameValidationChecking(firstName);
                    }
                    while (validName == false);
                    break;

                case 2:
                    //Last name input
                    do {
                        System.out.printf("Enter a Last Name of User: ");
                        String lastName = sc.nextLine();
                        validName = RegexCheckingOperations.usernameValidationChecking(lastName);
                    }
                    while (validName == false);
                    break;

                case 3:
                    //eMail input
                    do {
                        System.out.printf("Enter a E-Mail of User: ");
                        String email = sc.nextLine();
                        validName = RegexCheckingOperations.emailValidationChecking(email);
                    }
                    while (validName == false);
                    break;

                case 4:
                    //Mobile Number input
                    do {
                        System.out.printf("Enter a Mobile Number of User: ");
                        String mNum = sc.nextLine();
                        validName = RegexCheckingOperations.mNumValidationChecking(mNum);
                    }
                    while (validName == false);
                    break;

                case 5:
                    //Password input
                    do {
                        System.out.printf("Enter a Password of User: ");
                        String password = sc.nextLine();
                        validName = RegexCheckingOperations.passwordValidationChecking(password);
                    }
                    while (validName == false);
                    break;

                case 6:
                    maintain = 1;
                    System.out.println("EXIT");
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        }


    }
}
