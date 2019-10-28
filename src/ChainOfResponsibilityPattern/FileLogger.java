package ChainOfResponsibilityPattern;

/**
 * Created by AndrewKing on 10/24/2019.
 */
public class FileLogger extends AbstractLogger {

    public FileLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}