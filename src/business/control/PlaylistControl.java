package business.control;

import business.model.Artist;

import java.util.ArrayList;
import java.util.Map;

/**
 * Created by Marcelo on 17/05/2017.
 */
public class PlaylistControl {

    private Map<String, Artist> playlists;
    private static PlaylistControl instance = new PlaylistControl();

    public static PlaylistControl getInstance() {
        return instance;
    }

    private PlaylistControl() {}

    public Map<String, Artist> getPlaylists() {
        return playlists;
    }
}
