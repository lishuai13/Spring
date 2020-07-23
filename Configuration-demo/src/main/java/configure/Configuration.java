package configure;

import entity.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

/**
 * 使用Configuration文件取代完全取代xml
 */
@org.springframework.context.annotation.Configuration
//扫描包的注解
@ComponentScan("entity")
public class Configuration {

    @Bean      //相当于bean标签，方法名为id，返回值为id
    public Person getPerson(){
        return new Person();
    }
}
