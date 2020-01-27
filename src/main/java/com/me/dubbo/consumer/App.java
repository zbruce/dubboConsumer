package com.me.dubbo.consumer;

import com.me.dubbo.api.service.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        DemoService demoService = (DemoService)context.getBean("demoService");
        System.out.println(demoService.sayHello("tom"));
    }
}
