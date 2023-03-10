package validator;

public class UserLoginValidator {
    public ValidationResult isValid(String email, String password){
        ValidationResult validationResult = new ValidationResult();
        if(!email.matches("\\w+@\\w+\\.\\w+")){
            validationResult.addError(new ErrorContent("Please, input correct email address"));
        }
        if(password.length()<8){
            validationResult.addError(new ErrorContent("Password length must be 8 or more characters"));
        }
        return validationResult;
    }
}
