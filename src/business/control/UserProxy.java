package business.control;

import Infra.PersistenceException;
import business.model.User;
import business.util.LoginInvalidException;
import business.util.PasswordInvalidException;

/**
 * Created by wesnydy on 05/06/17.
 */
public class UserProxy extends UserControl {
    protected String user;
    protected String password;

    public UserProxy(String user, String password) {
        this.user = user;
        this.password = password;
    }

    @Override
    public void addUser(User user) throws LoginInvalidException, PasswordInvalidException, PersistenceException {
        if (IsAllowedAccess()) {
            super.addUser(user);
        }
        return;
    }

    @Override
    public void updateUser(User user) throws LoginInvalidException, PasswordInvalidException, PersistenceException {
        if (IsAllowedAccess()) {
            super.updateUser(user);
        }
        return;
    }

    @Override
    public void removeUser(String login) {
        if (IsAllowedAccess()) {
            super.removeUser(login);
        }
        return;
    }

    private boolean IsAllowedAccess() {
        return user == "admin" && password == "admin";
    }
}
