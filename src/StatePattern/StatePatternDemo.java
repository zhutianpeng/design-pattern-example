package StatePattern;

/**
 * Created by AndrewKing on 10/23/2019.
 */
public class StatePatternDemo {
    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        context.changeState(startState);
        context.request("TCP");

        StopState stopState = new StopState();
        context.changeState(stopState);
        context.request("TCP");

    }
}