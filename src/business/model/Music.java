package business.model;

/**
 * Created by Marcelo on 17/05/2017.
 */
public class Music {

    private String name;
    private Integer duration;

    public Music(String name, Integer duration) {
        this.name = name;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public Integer getDuration() {
        return duration;
    }
}
