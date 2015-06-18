package tw.proxy;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Logging {

    @Pointcut("execution(* tw.aop.*.*(..))")
    private void selectAll() {
    }

    @Before("selectAll()")
    private void before() {
        System.out.println("begging to draw");
    }

    @After("selectAll()")
    private void after() {
        System.out.println("finish drawing");
    }
}
