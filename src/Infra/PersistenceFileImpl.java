package Infra;

import business.model.User;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by caiomcg on 17/05/17.
 */
public class PersistenceFileImpl implements Persistence {

    @Override
    public void saveOnDatabase(Map<String, User> data) throws PersistenceException {

    }

    @Override
    public HashMap<String, User> loadFromDatabase() {
        return null;
    }
}
