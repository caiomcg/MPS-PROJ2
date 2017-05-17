package business.control;

import business.model.Artist;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Marcelo on 17/05/2017.
 */
public class MSNManager {

    public List<Artist> getEventGroup(String id) {

        openConnection();
        List<Artist> artists = new ArrayList<>();

        // Convert list of artists from MSN to a list of Artists.

        closeConnection();

        return artists;
    }

    // Connects to the MSN
    private void openConnection(){}

    private void closeConnection(){}

}
