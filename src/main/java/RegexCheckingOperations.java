import java.util.regex.Pattern;

public class RegexCheckingOperations {
    /**
     * Username Validation Checking Method
     * @param name
     * @return
     */
    public static boolean usernameValidationChecking(String name) throws InvalidUserInputException {
        boolean validation = Pattern.matches("^[A-Z][a-z]{2,}",name);
        if(validation){
            System.out.println(name+" is Valid name");
        }
        else {
            System.out.println(name+" is Invalid name");
            throw new InvalidUserInputException("Enter Valid Details");
        }
        return validation;
    }

    /**
     * email Validation Checking Method
     * @param name
     * @return
     */
    public static boolean emailValidationChecking(String name) throws InvalidUserInputException {
        boolean validation = Pattern.matches("^[A-Za-z0-9+_.-]+@(.+)$",name);  //^[A-Za-z0-9+_.-]+@bl[.]co[.]?[i]?[n]?
        if(validation){
            System.out.println(name+" is Valid mail");
        }
        else {
            System.out.println(name+" is Invalid mail");
            throw new InvalidUserInputException("Enter Valid Details");
        }
        return validation;
    }

    /**
     * Mobile Number Validation checking
     * @param name
     * @return
     */
    public static boolean mNumValidationChecking(String name) throws InvalidUserInputException {
        boolean validation = Pattern.matches("^[1-9][0-9]+[ ]{0,1}+[1-9][0-9]{9}$",name);  //[[a-z]{3,}][.]?[[a-z]{3,}]?[@]
        if(validation){
            System.out.println(name+" is Valid mobile Number");
        }
        else {
            System.out.println(name+" is Invalid mobile Number");
            throw new InvalidUserInputException("Enter Valid Details");
        }
        return validation;
    }

    /**
     * Password Validation method
     * @param name
     * @return
     */
    public static boolean passwordValidationChecking(String name) throws InvalidUserInputException {
        boolean validation = Pattern.matches("(?=.*[a-z])(?=.*[A-Z])(?=.*[1-9])(?=.*[@#$%!]{1}).{8,}",name);    //passwordRegex
        if(validation){
            System.out.println(name+" is Valid Password");
        }
        else {
            System.out.println(name+" is Invalid Password");
            throw new InvalidUserInputException("Enter Valid Details");
        }
        return validation;
    }
}
