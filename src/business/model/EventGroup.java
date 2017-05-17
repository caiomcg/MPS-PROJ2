package business.model;

import java.util.List;

/**
 * Created by Marcelo on 17/05/2017.
 */
public class EventGroup {

    private List<Participant> participants;

    public EventGroup(List<Participant> participants) {
        this.participants = participants;
    }

    public List<Participant> getParticipants() {
        return participants;
    }
}
