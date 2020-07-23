import dao.testMapper;
import entity.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Spring整合mybatis
 */
public class MyTest {

    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        testMapper test = context.getBean("testMapper", testMapper.class);
        List<User> all = test.getAll();
        for (User user : all) {
            System.out.println(user.toString());
        }
    }

    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        testMapper test = context.getBean("testMapper", testMapper.class);
        int delete = test.delete(2);
        System.out.println(delete);
    }

    @Test
    public void test3(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        testMapper test = context.getBean("testMapper", testMapper.class);
        Map<String,Object> map = new HashMap<>();
        map.put("id",7);
        map.put("name","小卡");
        int update = test.update(map);
        System.out.println(update);
    }
}
