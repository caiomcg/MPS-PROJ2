package Infra;

import business.model.User;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * Created by caiomcg on 17/05/17.
 */
public class PersistenceFileImpl implements Persistence {
    private final String filename = "persistency.bin";

    public PersistenceFileImpl() {

    }

    @Override
    public void saveOnDatabase(Map<String, User> data) throws PersistenceException {
        System.out.println(data.toString());

        try {
            FileOutputStream fileOut =
                    new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(data);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in /tmp/employee.ser");
        }catch(IOException i) {
            i.printStackTrace();
        }
    }

    @Override
    public HashMap<String, User> loadFromDatabase() {
        HashMap<String, User> data = null;
        try {
            FileInputStream fileIn = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            data = (HashMap<String, User>) in.readObject();
            in.close();
            fileIn.close();
        }catch(IOException | ClassNotFoundException i) {
            return null;
        }
        return data;
    }
}
