package service;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * 方式三：注解实现Aop
 */
@Aspect
public class Annotation {

    @Before("execution(* service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("方法执行前！");
    }
    @After("execution(* service.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("方法执行后！");
    }

    @Around("execution(* service.UserServiceImpl.*(..))")
    private void around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("环绕前！");
        //获取方法的签名
        Signature signature = pjp.getSignature();
        System.out.println("签名："+signature);
        //执行方法，只是起定位作用
        pjp.proceed();
        System.out.println("环绕后！");
    }
}
