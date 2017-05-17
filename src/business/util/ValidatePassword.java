package business.util;

/**
 * Created by Marcelo on 10/04/2017.
 */
class ValidatePassword {

    private static final int PWD_MAX_LENGTH = 12;
    private static final int PWD_MIN_LENGTH = 8;

    static boolean validate(String password) throws PasswordInvalidException {

        if (password == null)
            throw new PasswordInvalidException("Password must be set.");

        if (password.length() > PWD_MAX_LENGTH)
            throw new PasswordInvalidException("Password must have " + PWD_MAX_LENGTH + " characters max.");

        if (password.length() < PWD_MIN_LENGTH)
            throw new PasswordInvalidException("Password must have " + PWD_MIN_LENGTH + " characters min.");

        if (!password.matches("(?=(.*\\d){2})(?=(.*[A-Za-z]))^.*"))
            throw new PasswordInvalidException("Password must have letters and numbers\n (at least 2 numbers)");

        return true;
    }

}
