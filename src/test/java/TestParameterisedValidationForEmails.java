import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class TestParameterisedValidationForEmails {

    String email;
    boolean expectedValidation;
    private RegexCheckingOperations mailValidationObj;

    /**
     * Constructor
     * @param email
     * @param expectedValidation
     */
    public TestParameterisedValidationForEmails(String email, boolean expectedValidation) {
        this.email = email;
        this.expectedValidation = expectedValidation;
    }

    @Before
    public void initialize(){
        mailValidationObj = new RegexCheckingOperations();
    }

    @Test
    public void testValidationOfEmailsUsingParameterisedTesting() throws InvalidUserInputException{
        RegexCheckingOperations mailValidationObj = new RegexCheckingOperations();
        Assert.assertEquals(expectedValidation, mailValidationObj.emailValidationChecking(email));          //assertEquals(expectedValidation,RegexCheckingOperations.emailValidationChecking(email));
    }

    /**
     * Collection Of data we required
     * @return
     */
    @Parameterized.Parameters
    public static List<Object[]> dataOfEmails(){
        return Arrays.asList(new Object[][] {{"abc.xyz@bl.co.in",true},{"abc.bc@yahoo.com",true},{"abc.100@abc.com.au",true},{"abc@.com",true},{"abc.com.in",false}});
    }
}
