package business.util;

/**
 * Created by Marcelo Aguiar on 05/04/17.
 */
public class LoginInvalidException extends Exception {

    private static final long serialVersionUID = 118863948449321218L;

    public LoginInvalidException() {
        super("Login Error");
    }

    public LoginInvalidException(String message) {
        super(message);
    }
}
