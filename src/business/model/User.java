package business.model;

import java.io.Serializable;

/**
 * Created by Marcelo on 17/05/2017.
 */
public class User implements Serializable{

    private String login;
    private String password;

    public User(String login, String pwd) {
        this.login = login;
        this.password = pwd;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String pwd) {
        this.password = pwd;
    }

    @Override
    public String toString() {
        return login + " " + password;
    }
}
