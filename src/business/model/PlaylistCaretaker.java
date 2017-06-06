package business.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Marcelo on 06/06/2017.
 */
public class PlaylistCaretaker {

    private List<PlaylistMemento> mementoList = new ArrayList<>();

    public void add(PlaylistMemento state){
        mementoList.add(state);
    }

    public PlaylistMemento get(int index){
        return mementoList.get(index);
    }
}
