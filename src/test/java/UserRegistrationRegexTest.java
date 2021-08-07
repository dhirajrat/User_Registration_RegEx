import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationRegexTest {
    @Test
    public void testFirstNameValidation(){
        try {
            String firstName = "Dhiraj";
            Assertions.assertEquals(true, RegexCheckingOperations.usernameValidationChecking(firstName));
        }
        catch (InvalidUserInputException e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void testFalseFirstNameValidationWithSmallCapStart(){
        try {
            String firstName = "dhiraj";
            Assertions.assertEquals(true, RegexCheckingOperations.usernameValidationChecking(firstName));
        }
        catch (InvalidUserInputException e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void testLastNameValidation(){
        try {
            String lastName = "Rathod";
            Assertions.assertEquals(true, RegexCheckingOperations.usernameValidationChecking(lastName));
        }catch (InvalidUserInputException e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void testEmailValidation(){
        try {
            String email = "abc.xyz@bl.co.in";
            Assertions.assertEquals(true,RegexCheckingOperations.emailValidationChecking(email));
        }catch (InvalidUserInputException e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void testPhoneValidation(){
        try {
            String pNum = "91 9604508795";
            Assertions.assertEquals(true,RegexCheckingOperations.mNumValidationChecking(pNum));
        }
        catch (InvalidUserInputException e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void testPasswordValidation(){
        try{
            String password = "sdkk#as5dlG";
            Assertions.assertEquals(true,RegexCheckingOperations.passwordValidationChecking(password));
        }catch (InvalidUserInputException e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void testPasswordValidationWithNull(){
        try{
            String password = null;
            Assertions.assertEquals(true,RegexCheckingOperations.passwordValidationChecking(password));
        }catch (InvalidUserInputException e){
            System.out.println(e.getMessage());
        }
    }
}
