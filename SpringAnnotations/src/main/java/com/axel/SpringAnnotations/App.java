package com.axel.SpringAnnotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */

//Spring Core Annotations
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
        Samsung S7 = factory.getBean(Samsung.class);
        S7.config();
    }
}
