package business.model;

import java.util.List;

/**
 * Created by Marcelo on 17/05/2017.
 */
public class Artist {

    private List<Album> albumList;

    public Artist(List<Album> albumList) {
        this.albumList = albumList;
    }

    public List<Album> getAlbumList() {
        return albumList;
    }
}
