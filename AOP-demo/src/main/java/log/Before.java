package log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * 方法前新增业务
 */
public class Before implements MethodBeforeAdvice {
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println(o.getClass().getSimpleName()+"将要执行"+method.getName()+"方法：");
    }
}
