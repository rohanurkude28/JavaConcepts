package exceptions;

public class UserDefinedUncheckedException extends RuntimeException{

    public UserDefinedUncheckedException(String errorMessage) {
        super(errorMessage);
    }
}
