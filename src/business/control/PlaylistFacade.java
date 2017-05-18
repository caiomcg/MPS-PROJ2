package business.control;

import business.model.Playlist;

import java.util.ArrayList;

/**
 * Created by wesnydy on 17/05/17.
 */
public class PlaylistFacade {

//    PlaylistControl playlistControl;
    private ArrayList<Playlist> playlists;

    public void addPlaylist(Playlist playlist) {
//      playlistControl.addPlaylist();
        playlists.add(playlist);
    }

    public void updatePlaylist(Playlist oldPlaylist, Playlist newPlaylist) {
        int index = playlists.indexOf(oldPlaylist);
        if (index != -1 )
            playlists.set(index, newPlaylist);
    }

    public void removePlaylist(Playlist playlist) {
        playlists.remove(playlist);
    }

    public ArrayList<Playlist> findPlaylists() {
       return playlists;
    }
}
