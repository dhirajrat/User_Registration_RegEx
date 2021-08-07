import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationRegexTest {
    @Test
    public void testFirstNameValidation(){
        try {
            String firstName = null;
            Assertions.assertEquals(true, RegexCheckingOperations.usernameValidationChecking(firstName));
        }
        catch (Exception e){
            System.out.println("Enter valid details");
        }
    }

    @Test
    public void testLastNameValidation(){
        try {
            String lastName = "Rathod";
            Assertions.assertEquals(true, RegexCheckingOperations.usernameValidationChecking(lastName));
        }catch (Exception e){
            System.out.println("Enter valid details");
        }
    }

    @Test
    public void testEmailValidation(){
        try {
            String email = "abc.xyz@bl.co.in";
            Assertions.assertEquals(true,RegexCheckingOperations.emailValidationChecking(email));
        }catch (Exception e){
            System.out.println("Enter valid details");
        }
    }

    @Test
    public void testPhoneValidation(){
        try {
            String pNum = "91 9604508795";
            Assertions.assertEquals(true,RegexCheckingOperations.mNumValidationChecking(pNum));
        }
        catch (Exception e){
            System.out.println("Enter valid details");
        }
    }

    @Test
    public void testPasswordValidation(){
        try{
            String password = "sdkk#as5dlG";
            Assertions.assertEquals(true,RegexCheckingOperations.passwordValidationChecking(password));
        }catch (Exception e){
            System.out.println("Enter valid details");
        }
    }

    @Test
    public void testPasswordValidationWithNull(){
        try{
            String password = null;
            Assertions.assertEquals(true,RegexCheckingOperations.passwordValidationChecking(password));
        }catch (Exception e){
            System.out.println("Enter valid details");
        }
    }
}
