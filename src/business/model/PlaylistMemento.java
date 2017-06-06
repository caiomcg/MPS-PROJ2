package business.model;

/**
 * Created by Marcelo on 06/06/2017.
 */
public class PlaylistMemento {
    private Playlist playlist;

    public PlaylistMemento(Playlist playlist) {
        this.playlist = new Playlist(playlist);
    }

    public Playlist getPlaylist() {
        return playlist;
    }
}
