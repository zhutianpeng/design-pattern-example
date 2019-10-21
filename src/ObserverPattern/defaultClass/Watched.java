package ObserverPattern.defaultClass;

import java.util.Observable;

/**
 * Created by AndrewKing on 10/21/2019.
 */
public class Watched extends Observable {

    private String data = "";

    public String getData() {
        return data;
    }

    public void setData(String data) {

        if(!this.data.equals(data)){
            this.data = data;
            setChanged();
        }
        notifyObservers();
    }


}