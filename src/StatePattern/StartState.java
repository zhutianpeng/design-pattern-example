package StatePattern;

/**
 * Created by AndrewKing on 10/23/2019.
 */
public class StartState implements State {

    @Override
    public void handle(String parameter) {
        System.out.println("connect "+ parameter);
    }

    @Override
    public String toString(){
        return "Start State";
    }
}
