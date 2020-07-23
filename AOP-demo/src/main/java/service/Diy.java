package service;

/**
 * 方式二实现Aop，自定义切面类
 */
public class Diy {
    public void before(){
        System.out.println("方法执行前！");
    }
    public void after(){
        System.out.println("方法执行后！");
    }
}
