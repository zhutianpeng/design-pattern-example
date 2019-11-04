package ProxyPattern.DynamicProxy;

/**
 * Created by AndrewKing on 11/4/2019.
 */
import org.junit.Test;

public class TestProxy {

    @Test
    public void testDynamicProxy (){
        IUserDao target = new UserDao();
        System.out.println(target.getClass());  //输出目标对象信息
        IUserDao DaoProxy = (IUserDao) new ProxyFactory(target).getProxyInstance();
        System.out.println(DaoProxy.getClass());  //输出代理对象信息
        DaoProxy.save();  //执行代理方法
    }
}