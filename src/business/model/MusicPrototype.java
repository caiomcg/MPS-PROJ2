package business.model;

import java.util.Map;

/**
 * Created by wesnydy on 05/06/17.
 */
public abstract class MusicPrototype {
    protected String name;
    protected Integer duration;
    protected String genre;

    public abstract MusicPrototype clone();

    public String getName() { return name; }

    public Integer getDuration() {
        return duration;
    }

    public String getGenre() {
        return genre;
    }
}
