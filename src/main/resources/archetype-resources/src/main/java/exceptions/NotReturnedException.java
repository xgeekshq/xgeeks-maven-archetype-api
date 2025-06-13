package ${package}.exceptions;

public class NotReturnedException extends RuntimeException {

    public NotReturnedException(String message) {
        super(message);
    }

    public NotReturnedException(String message, Throwable cause) {
        super(message, cause);
    }
}