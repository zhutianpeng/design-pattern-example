package StatePattern;

/**
 * Created by AndrewKing on 10/23/2019.
 */
public class StopState implements State {

    @Override
    public void handle(String parameter) {
        System.out.println("Stop " + parameter);
    }

    @Override
    public String toString(){
        return "Stop State";
    }
}
