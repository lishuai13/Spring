package log;

import org.springframework.aop.AfterReturningAdvice;
import java.lang.reflect.Method;

/**
 * 方法后新增业务
 */
public class After implements AfterReturningAdvice{
    public void afterReturning(Object result, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println(o1.getClass().getSimpleName()+"已经执行了"+method.getName()+"方法,返回结果为"+result.toString());
    }
}
