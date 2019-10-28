package StatePattern;

/**
 * Created by AndrewKing on 10/23/2019.
 */
public class Context {
    private State state;

    public Context(){
        state = null;
    }

    public void changeState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }

    public void request(String parameter){
        state.handle(parameter);
    }
}