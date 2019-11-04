package ObserverPattern.example;

/**
 * Created by AndrewKing on 10/21/2019.
 */
public class BinaryObserver extends Observer{
    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Binary String: "+ Integer.toBinaryString( subject.getState() ) );
    }
}
