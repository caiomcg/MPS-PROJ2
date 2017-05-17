package business.model;

import java.util.Map;

/**
 * Created by Marcelo on 17/05/2017.
 */
public class Artist {

    private Map<String, Album> albumList;

    public Artist(Map<String, Album> albumList) {
        this.albumList = albumList;
    }

    public Map<String, Album> getAlbumList() {
        return albumList;
    }

    public Album getAlbum(String name) {
        return albumList.get(name);
    }
}
