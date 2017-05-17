package business.model;

import java.util.Map;

/**
 * Created by Marcelo on 17/05/2017.
 */
public class Album {

    private Map<String, Music> musicList;

    public Album(Map<String, Music> musicList) {
        this.musicList = musicList;
    }

    public Map<String, Music> getMusicList() {
        return musicList;
    }

    public Music getMusic(String name) {
        return musicList.get(name);
    }
}
