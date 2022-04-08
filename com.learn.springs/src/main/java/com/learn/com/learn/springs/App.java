package com.learn.com.learn.springs;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    ApplicationContext ctx=  new ClassPathXmlApplicationContext("config.xml");
                                           Laptop l =(Laptop) ctx.getBean("lappy");
                                           System.out.println(l);
    }
}
