import java.util.regex.Pattern;

public class RegexCheckingOperations {
    /**
     * Username Validation Checking Method
     * @param name
     * @return
     */
    public static boolean usernameValidationChecking(String name){
        boolean validation = Pattern.matches("^[A-Z][a-z]{2,}",name);
        if(validation){
            System.out.println(name+" is Valid name");
        }
        else {
            System.out.println(name+" is Invalid name");
        }
        return validation;
    }
}
