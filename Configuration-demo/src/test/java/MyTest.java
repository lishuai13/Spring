import configure.Configuration;
import entity.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 使用配置类取代XML
 */
public class MyTest {

    @Test
    public void test(){
        ApplicationContext context = new AnnotationConfigApplicationContext(Configuration.class);
        Person getPerson = context.getBean("getPerson", Person.class);
        System.out.println(getPerson.toString());
    }
}
