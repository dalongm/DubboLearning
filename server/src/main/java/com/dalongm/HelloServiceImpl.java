package com.dalongm;

import com.dalongm.api.IHelloService;

public class HelloServiceImpl implements IHelloService {

    @Override
    public String sayHello(String name) {
        return name;
    }
}
