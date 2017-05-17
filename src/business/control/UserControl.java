package business.control;

import Infra.Persistence;
import Infra.PersistenceException;
import Infra.PersistenceMaker;
import Infra.PersistenceType;
import business.model.User;
import business.util.LoginInvalidException;
import business.util.PasswordInvalidException;
import business.util.ValidateUser;

import java.util.ArrayList;
import java.util.Map;

/**
 * Created by caiomcg on 17/05/17.
 */
public class UserControl {

    private Map<String, User> users;
    private static UserControl instance = new UserControl();
    private PersistenceMaker persistence = new PersistenceMaker(PersistenceType.JSON);

    public static UserControl getInstance() {
        return instance;
    }

    private UserControl() {}

    public void addUser(User user) throws LoginInvalidException, PasswordInvalidException, PersistenceException {

        if (ValidateUser.validateUser(user)) {
            this.users.put(user.getLogin(), user);
//            this.persistence.saveOnDatabase(this.users);
        }
    }

    public void updateUser(User user) throws LoginInvalidException, PasswordInvalidException, PersistenceException {
        this.addUser(user);
    }

    public void removeUser(String login) {
        users.remove(login);
//        this.persistence.saveOnDatabase(this.users);
    }


    public Map<String, User> getAllUsers() {
        return users;
    }

    public User getUser(String login) {
        return this.users.get(login);
    }

    public ArrayList<User> getAsList() {
        return new ArrayList<User>(users.values());
    }

}
