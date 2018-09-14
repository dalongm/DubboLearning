package com.dalongm;

import com.dalongm.api.IHelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"consumer.xml"});
        context.start();
        IHelloService helloService = (IHelloService)context.getBean("helloService");
        String hello = helloService.sayHello("hello world");
        System.out.println(hello);
    }
}
