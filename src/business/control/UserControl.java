package business.control;

import business.model.User;

import java.util.ArrayList;
import java.util.Map;

/**
 * Created by caiomcg on 17/05/17.
 */
public class UserControl {

    private Map<String, User> users;
    private static UserControl instance = new UserControl();

    public static UserControl getInstance() {
        return instance;
    }

    private UserControl() {}

    public void addUser(User user) {

        this.users.put(user.getLogin(), user);
//        this.persistence.saveOnDatabase(this.users);
    }

    public void updateUser(User user) {
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
