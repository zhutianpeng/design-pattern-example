package ObserverPattern.example;

/**
 * Created by AndrewKing on 10/21/2019.
 */

public abstract class Observer {
    protected Subject subject;
//    这里是pull模型，在更新数据的时候，没有传递数据，具体的数据是通过subject拉取到的
    public abstract void update();
}

