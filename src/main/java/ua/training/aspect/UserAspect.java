package ua.training.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class UserAspect {
    private int count = 0;

    @Pointcut("execution(* get*(..))")
    public void beforeAllget() {
    }

    @Pointcut("execution(* print*(..))")
    public void beforeprint() {
    }


    @Before("beforeAllget()")
    public void getAdvice() {
        count++;

    }

    @After("beforeprint()")
    public void printAdvice() {
        System.out.println("advice method called " + count);

    }

}
