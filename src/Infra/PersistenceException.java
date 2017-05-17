package Infra;

/**
 * Created by caiomcg on 17/05/17.
 */
public class PersistenceException extends Exception {

    public PersistenceException() {
        super("Persistence Error.");
    }

    public PersistenceException(String message) {
        super(message);
    }
}