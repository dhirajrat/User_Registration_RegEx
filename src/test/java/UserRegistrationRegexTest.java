import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationRegexTest {

    // True Username value Testing
    @Test
    public void testFirstNameValidation() throws InvalidUserInputException {

            String firstName = "Dhiraj";
            Assertions.assertEquals(true, RegexCheckingOperations.usernameValidationChecking(firstName));
    }

    // False Username value testing
    @Test
    public void testFalseFirstNameValidationWithSmallCapStart() throws InvalidUserInputException {

            String firstName = "dhiraj";
            Assertions.assertEquals(true, RegexCheckingOperations.usernameValidationChecking(firstName));
    }

    // True Lastname value Testing
    @Test
    public void testLastNameValidation() throws InvalidUserInputException {

            String lastName = "Rathod";
            Assertions.assertEquals(true, RegexCheckingOperations.usernameValidationChecking(lastName));
    }

    // Null Value Testing For First name
    @Test
    public void testPasswordValidationWithNull() throws InvalidUserInputException {

        String password = null;
        Assertions.assertEquals(true,RegexCheckingOperations.passwordValidationChecking(password));
    }

    // Email Validation True Value Testing
    @Test
    public void testEmailValidation() throws InvalidUserInputException {

            String email = "abc.xyz@bl.co.in";
            Assertions.assertEquals(true,RegexCheckingOperations.emailValidationChecking(email));
    }

    // Phone Number Valid Value Testing
    @Test
    public void testPhoneValidation() throws InvalidUserInputException {

            String pNum = "91 9604508795";
            Assertions.assertEquals(true,RegexCheckingOperations.mNumValidationChecking(pNum));
    }

    // Password Validation Testing
    @Test
    public void testPasswordValidation() throws InvalidUserInputException {

            String password = "sdkk#as5dlG";
            Assertions.assertEquals(true,RegexCheckingOperations.passwordValidationChecking(password));
    }

    // False Value Password Validation Testing
    @Test
    public void testFalsePasswordValidation() throws InvalidUserInputException {

        String password = "sdkkaslG";
        Assertions.assertEquals(true,RegexCheckingOperations.passwordValidationChecking(password));
    }

}
