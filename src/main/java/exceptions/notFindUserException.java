package exceptions;

public class notFindUserException extends RuntimeException{
    public notFindUserException(String message) {
        super(message);
    }
}
