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

    /**
     * email Validation Checking Method
     * @param name
     * @return
     */
    public static boolean emailValidationChecking(String name){
        boolean validation = Pattern.matches("^[A-Za-z0-9+_.-]+@(.+)$",name);  //^[A-Za-z0-9+_.-]+@bl[.]co[.]?[i]?[n]?
        if(validation){
            System.out.println(name+" is Valid mail");
        }
        else {
            System.out.println(name+" is Invalid mail");
        }
        return validation;
    }
}
