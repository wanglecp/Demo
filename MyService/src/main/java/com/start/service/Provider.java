package com.start.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Provider {

    public static void main(String[] args){
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext(new String[]{"provider.xml"});
        context.start();
        System.out.println("provider 服务开启");
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
