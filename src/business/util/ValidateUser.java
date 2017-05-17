package business.util;

import business.model.User;

/**
 * Created by Marcelo Aguiar on 05/04/17.
 */
public class ValidateUser {

    public static boolean validateUser(User user) throws LoginInvalidException, PasswordInvalidException {
        return ValidateLogin.validate(user.getLogin())&&
                ValidatePassword.validate(user.getPassword());
    }

}
