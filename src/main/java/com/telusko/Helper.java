package com.telusko;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

@Component
@Aspect
@EnableAspectJAutoProxy
public class Helper {
    //Advice - before, After
    // PointCut - at when we need to call thi s

    @Before("execution(public String add())")  
    public void log(){
        System.out.println("logged");
    }
}
