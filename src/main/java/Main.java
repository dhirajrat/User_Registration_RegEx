import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *  Main Class
 */
public class Main {
    public static void main(String[] args) throws InvalidUserInputException {
        Scanner sc = new Scanner(System.in);
        Scanner ch = new Scanner(System.in);
        boolean validName;

        RegexChecker firstnameValidate = (firstName) -> { return Pattern.matches("^[A-Z][a-z]{2,}",firstName); };

        RegexChecker lastNameValidate = (lastName) -> { return Pattern.matches("^[A-Z][a-z]{2,}",lastName); };

        RegexChecker emailValidate = (email) -> { return Pattern.matches("^[a-zA-Z]+([.][a-zA-Z]+)*@[a-zA-Z]+[.][a-zA-Z]{2,3}+([.][a-zA-Z]{2}+)*$",email); };

        RegexChecker mNumValidate = (mNumber) -> { return Pattern.matches("^[1-9][0-9]+[ ]{0,1}+[1-9][0-9]{9}$",mNumber); };

        RegexChecker passwordValidate = (password) -> { return Pattern.matches("(?=.*[a-z])(?=.*[A-Z])(?=.*[1-9])(?=.*[@#$%!]{1}).{8,}",password); };

        int maintain = 0;

        while(maintain == 0) {
            System.out.println("\nEnter a choice to validate input of :\n1.FirstName 2.LastName 3.E-mail 4.PhoneNumber 5.Password 6.EXIT");
            int choice = ch.nextInt();
            switch(choice) {
                case 1:
                    //First name input
                    do {
                        System.out.printf("Enter a First Name of User: ");
                        String firstName = sc.nextLine();
                        validName = firstnameValidate.validator(firstName);
                        System.out.println("First name matches : "+validName);
                    }
                    while (validName == false);
                    break;

                case 2:
                    //Last name input
                    do {
                        System.out.printf("Enter a Last Name of User: ");
                        String lastName = sc.nextLine();
                        validName = lastNameValidate.validator(lastName);
                        System.out.println("Last name matches : "+validName);
                    }
                    while (validName == false);
                    break;

                case 3:
                    //eMail input
                    do {
                        System.out.printf("Enter a E-Mail of User: ");
                        String email = sc.nextLine();
                        validName = emailValidate.validator(email);
                        System.out.println("Email-ID matches : "+validName);
                    }
                    while (validName == false);
                    break;

                case 4:
                    //Mobile Number input
                    do {
                        System.out.printf("Enter a Mobile Number of User: ");
                        String mNum = sc.nextLine();
                        validName = mNumValidate.validator(mNum);
                        System.out.println("Mobile Number matches : "+validName);
                    }
                    while (validName == false);
                    break;

                case 5:
                    //Password input
                    do {
                        System.out.printf("Enter a Password of User: ");
                        String password = sc.nextLine();
                        validName = passwordValidate.validator(password);
                        System.out.println("PassWord matches : "+validName);
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
