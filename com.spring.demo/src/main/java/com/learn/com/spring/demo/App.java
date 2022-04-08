package com.learn.com.spring.demo;

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
          ApplicationContext ctx= new ClassPathXmlApplicationContext("config.xml");
          Fresher1 f=(Fresher1) ctx.getBean("fr");
    System.out.println(f);
    }
}
