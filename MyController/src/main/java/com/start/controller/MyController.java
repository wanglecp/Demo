package com.start.controller;

import com.start.interfence.MyInterfence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MyController {
    @Autowired
    private MyInterfence myInterfence;
    @RequestMapping("/test.do")
    public String getTest() {
        System.out.print("11111111111");
        String str = myInterfence.helloWorld();
        System.out.print(str);
        return "welcome";
    }

    /*public static void main(String[] args){
        //ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("consumer.xml");
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext(new String[]{"consumer.xml"});
        context.start();
        System.out.println("消费者。。。");
        MyInterfence my= (MyInterfence) context.getBean("myInterfence");
        my.helloWorld();
    }*/
}
