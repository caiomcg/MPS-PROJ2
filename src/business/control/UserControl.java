package business.control;

import Infra.PersistenceException;
import business.model.User;
import business.util.LoginInvalidException;
import business.util.PasswordInvalidException;

/**
 * Created by Marcelo on 06/06/2017.
 */
public interface UserControl {
    void addUser(User user) throws LoginInvalidException, PasswordInvalidException, PersistenceException;
    void updateUser(User user) throws LoginInvalidException, PasswordInvalidException, PersistenceException;
    void removeUser(String login);

}
