package Infra.Persistence;

import business.model.User;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by caiomcg on 17/05/17.
 */
public interface Persistence {
    void saveOnDatabase(Map<String, User> data) throws PersistenceException;
    HashMap<String, User> loadFromDatabase();
}
