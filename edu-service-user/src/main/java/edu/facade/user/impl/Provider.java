package edu.facade.user.impl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description: Created with IntelliJ IDEA.
 * @Author: zhouwen
 * @Date: 2016/11/22 21:26
 */
public class Provider {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:/provider.xml");
        context.start();
        System.out.println("provider started!!!");
        System.in.read();
    }
}
