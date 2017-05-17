package business.model;

import business.control.PlaylistControl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Marcelo on 17/05/2017.
 */
public class PlaylistReport extends StatisticsReport {

    @Override
    protected List<String> generateList() {
        PlaylistControl playlistControl = PlaylistControl.getInstance();

        Map<String, Artist> users = playlistControl.getPlaylists();

        return new ArrayList<>(users.keySet());
    }
}
