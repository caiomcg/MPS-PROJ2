package Infra;

/**
 * Created by caiomcg on 17/05/17.
 */
public class PersistenceFactory {
    public static Persistence createPersistence(PersistenceType type) {
        switch (type) {
            case DB:
                return new PersistenceFileImpl();
            case JSON:
                return PersistenceJSONImpl.getInstance();
            default:
                return null;
        }
    }
}
