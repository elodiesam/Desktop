package upo.cpo3;

/**
 * Created by elodisam on 01/10/2015.
 */
public class TransitionException extends Exception {
    public TransitionException() {
    }

    public TransitionException(String message) {
        super(message);
    }

    public TransitionException(String message, Throwable cause) {
        super(message, cause);
    }

    public TransitionException(Throwable cause) {
        super(cause);
    }
}
