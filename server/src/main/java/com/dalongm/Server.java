package com.dalongm;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Server {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"provider.xml"});
        context.start();
        System.in.read();
    }
}
