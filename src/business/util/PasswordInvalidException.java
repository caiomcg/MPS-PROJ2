package business.util;

/**
 * Created by Marcelo Aguiar on 05/04/17.
 */
public class PasswordInvalidException extends Exception {

    private static final long serialVersionUID = 6993514145322617492L;

    public PasswordInvalidException() {
        super("Password Error");
    }

    public PasswordInvalidException(String message) {
        super(message);
    }
}
