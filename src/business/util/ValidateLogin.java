package business.util;

/**
 * Created by Marcelo on 10/04/2017.
 */
class ValidateLogin {

    private static final int LOGIN_MAX_LENGTH = 20;

    static boolean validate(String login) throws LoginInvalidException {

        if (login == null || login.isEmpty())
            throw new LoginInvalidException("Empty login");

        if (login.length() > LOGIN_MAX_LENGTH)
            throw new LoginInvalidException("Login must have " + LOGIN_MAX_LENGTH + " characters max.");

        if (login.matches(".*\\d.*"))
            throw new LoginInvalidException("Login can't have numbers.");

        return true;
    }
}
