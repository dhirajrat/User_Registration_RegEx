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

    /**
     * Mobile Number Validation checking
     * @param name
     * @return
     */
    public static boolean mNumValidationChecking(String name){
        boolean validation = Pattern.matches("^[1-9][0-9]+[ ]{0,1}+[1-9][0-9]{9}$",name);  //[[a-z]{3,}][.]?[[a-z]{3,}]?[@]
        if(validation){
            System.out.println(name+" is Valid mobile Number");
        }
        else {
            System.out.println(name+" is Invalid mobile Number");
        }
        return validation;
    }

    /**
     * Password Validation method
     * @param name
     * @return
     */
    public static boolean passwordValidationChecking(String name){
        boolean validation = Pattern.matches("(?=.*[a-z])(?=.*[A-Z])(?=.*[1-9])(?=.*[@#$%!]{1}).{8,}",name);
        if(validation){
            System.out.println(name+" is Valid Password");
        }
        else {
            System.out.println(name+" is Invalid Password");
        }
        return validation;
    }
}
