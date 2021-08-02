import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationRegexTest {
    @Test
    public void testFirstNameValidation(){
        String firstName = "Dhiraj";
        Assertions.assertEquals(true,RegexCheckingOperations.usernameValidationChecking(firstName));
    }

    @Test
    public void testLastNameValidation(){
        String lastName = "Rathod";
        Assertions.assertEquals(true,RegexCheckingOperations.usernameValidationChecking(lastName));
    }

    @Test
    public void testEmailValidation(){
        String email = "abc.xyz@bl.co.in";
        Assertions.assertEquals(true,RegexCheckingOperations.emailValidationChecking(email));
    }

    @Test
    public void testPhoneValidation(){
        String pNum = "91 9604508795";
        Assertions.assertEquals(true,RegexCheckingOperations.mNumValidationChecking(pNum));
    }

    @Test
    public void testPasswordValidation(){
        String password = "sdkk#as5dlG";
        Assertions.assertEquals(true,RegexCheckingOperations.passwordValidationChecking(password));
    }
}
