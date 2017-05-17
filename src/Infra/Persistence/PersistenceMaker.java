package Infra.Persistence;

import business.model.User;

/**
 * Created by caiomcg on 17/05/17.
 */
public class PersistenceMaker {
    private Persistence persistence;

    public PersistenceMaker(PersistenceType type) {
        persistence = PersistenceFactory.createPersistence(type);
    }

    public void addUser(User user) {

    }

    public void removeUser(String username) {

    }

    public void updateUser(User user) {

    }

    public User findUser(String username) {
        
    }
}
