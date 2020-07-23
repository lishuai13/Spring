import dao.Dao2Impl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.Service;
import service.ServiceImpl;

/**
 * IOC推导
 */
public class MyTest {
    public static void main(String[] args) {

//        ServiceImpl service = new ServiceImpl();
//        service.setDao(new Dao2Impl());
//        service.show();


        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        ServiceImpl serviceImpl = (ServiceImpl) context.getBean("serviceImpl");
        serviceImpl.show();


    }
}
