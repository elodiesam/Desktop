package upo.cpo4;

/**
 * Created by elodisam on 08/10/2015.
 */
public class PlaceException extends Exception {

    public PlaceException() {
    }

    public PlaceException(String message) {
        super(message);
    }

    public PlaceException(String message, Throwable cause) {
        super(message, cause);
    }

    public PlaceException(Throwable cause) {
        super(cause);
    }
}
