package Infra;

import business.model.User;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Marcelo on 11/04/2017.
 */
public class PersistenceJSONImpl implements Persistence {

    private static final String DATABASE = "./src/database/jsondb.json";
    private static PersistenceJSONImpl instance = new PersistenceJSONImpl();

    private PersistenceJSONImpl() {}

    public static PersistenceJSONImpl getInstance() {
        return instance;
    }

    @Override
    public void saveOnDatabase(Map<String, User> userMap) throws PersistenceException {
        String json = mapToJson(userMap);

        try {
            Files.write(Paths.get(DATABASE), json.getBytes());
        } catch (IOException e) {
            throw new PersistenceException("Unable to create database.");
        }
    }

    @Override
    public HashMap<String, User> loadFromDatabase() {
        String json;
        try {
            json = new String(Files.readAllBytes(Paths.get(DATABASE)));
        } catch (IOException e) {
            return new HashMap<>();
        }

        return jsonToMap(json);
    }

    private String mapToJson(Map<String, User> userMap) {
        Gson gson = new GsonBuilder().setPrettyPrinting()
                                     .create();

        return gson.toJson(userMap);
    }

    private HashMap<String, User> jsonToMap(String json) {
        Gson gson = new Gson();
        Type usersMapType = new TypeToken<HashMap<String, User>>(){}.getType();

        return gson.fromJson(json, usersMapType);
    }
}
