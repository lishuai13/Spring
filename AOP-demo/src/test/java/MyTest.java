import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.UserService;

/**
 * Spring实现Aop，动态代理
 */
public class MyTest {

    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //动态代理必须强转为接口类型
        UserService userServiceImpl = (UserService) context.getBean("userServiceImpl");
        userServiceImpl.query();
    }
}
