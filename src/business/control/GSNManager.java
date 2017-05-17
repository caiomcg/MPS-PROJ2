package business.control;

import business.model.EventGroup;
import business.model.Participant;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Marcelo on 17/05/2017.
 */
public class GSNManager {

    public EventGroup getEventGroup(String id) {

        openConnection();
        List<Participant> participants = new ArrayList<>();

        // Convert list of participants from GSN to a Participant list
        closeConnection();

        return new EventGroup(participants);
    }

    // Connects to the GSN
    private void openConnection(){}

    private void closeConnection(){}

}
