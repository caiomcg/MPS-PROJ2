package business.model;

import java.util.HashMap;
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

    public Playlist(Playlist playlist) {
        this.name = playlist.getName();
        this.artistMap = playlist.getArtistMap();
    }

    public Playlist() {
        this.name = "";
        this.artistMap = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Artist> getArtistMap() {
        return artistMap;
    }

    public void setArtistMap(Map<String, Artist> artistMap) {
        this.artistMap = artistMap;
    }

    public PlaylistMemento saveMemento() {
        return new PlaylistMemento(this);
    }

    public void getFromMemento(PlaylistMemento memento) {
        Playlist p = memento.getPlaylist();
        this.artistMap = p.getArtistMap();
        this.name = p.getName();
    }
}
