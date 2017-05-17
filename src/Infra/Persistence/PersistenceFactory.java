package Infra.Persistence;

/**
 * Created by caiomcg on 17/05/17.
 */
public class PersistenceFactory {
    public static Persistence createPersistence(PersistenceType type) {
        switch (type) {
            case DB:
                return new PersistenceDBImpl();
            case JSON:
                return new PersistenceJSONImpl();
            default:
                return null;
        }
    }
}
