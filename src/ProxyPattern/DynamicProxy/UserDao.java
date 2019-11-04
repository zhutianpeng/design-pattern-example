package ProxyPattern.DynamicProxy;

/**
 * Created by AndrewKing on 11/4/2019.
 */
public class UserDao implements IUserDao{

    @Override
    public void save() {
        System.out.println("保存数据");
    }
}