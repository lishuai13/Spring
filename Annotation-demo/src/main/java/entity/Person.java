package entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component  //等同于 <bean id="person" class="entity.Person"/>
public class Person {

    @Value("test")  //等同于<property>的赋值
    public String name;

}
