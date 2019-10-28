package ChainOfResponsibilityPattern;

/**
 * Created by AndrewKing on 10/24/2019.
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}