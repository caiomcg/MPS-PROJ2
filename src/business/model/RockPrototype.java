package business.model;

/**
 * Created by wesnydy on 05/06/17.
 */
public class RockPrototype extends MusicPrototype {
    protected RockPrototype(RockPrototype rockPrototype) {
        this.name = rockPrototype.getName();
        this.duration = rockPrototype.getDuration();
    }

    protected RockPrototype(String name, Integer duration) {
        this.genre = "Rock";
        this.name = name;
        this.duration = duration;
    }

    public MusicPrototype clone() {
        return new RockPrototype(this);
    }
}
