package business.model;

import java.util.Map;

/**
 * Created by Marcelo on 17/05/2017.
 */
public class Playlist {

    private String name;
    private Map<String, Artist> artistMap;

    public Playlist(String name, Map<String, Artist> artistMap) {
        this.name = name;
        this.artistMap = artistMap;
    }

    public String getName() {
        return name;
    }

    public Map<String, Artist> getArtistMap() {
        return artistMap;
    }
}
