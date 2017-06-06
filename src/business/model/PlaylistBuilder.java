package business.model;

import java.util.Map;

/**
 * Created by wesnydy on 05/06/17.
 */
public abstract class PlaylistBuilder {
    protected Playlist playlist;

    public PlaylistBuilder() {
        playlist = new Playlist();
    }

    public abstract void buildName(String name);
    public abstract void buildArtistMap(Map<String, Artist> artistMap);
    public Playlist getPlaylist() { return playlist; }
}
