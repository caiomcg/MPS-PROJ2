package Infra;

import business.model.User;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by caiomcg on 17/05/17.
 */
public class PersistenceFileImpl implements Persistence {
    private final String filename = "persistency.bin";
    private static PersistenceFileImpl instance = new PersistenceFileImpl();

    private PersistenceFileImpl() {}

    public static PersistenceFileImpl getInstance() {
        return instance;
    }

    @Override
    public void saveOnDatabase(Map<String, User> data) throws PersistenceException {
        System.out.println(data.toString());

        try (
                FileOutputStream fileOut = new FileOutputStream(filename);
                ObjectOutputStream out = new ObjectOutputStream(fileOut)
            ) {

            out.writeObject(data);
            System.out.printf("Serialized data is saved in /tmp/employee.ser");

        } catch(IOException i) {
            i.printStackTrace();
        }
    }

    @Override
    public HashMap<String, User> loadFromDatabase() {
        HashMap<String, User> data = null;
        try (
                FileInputStream fileIn = new FileInputStream(filename);
                ObjectInputStream in = new ObjectInputStream(fileIn);
            ) {

            data = (HashMap<String, User>) in.readObject();
        } catch(IOException | ClassNotFoundException i) {
            return null;
        }
        return data;
    }
}
