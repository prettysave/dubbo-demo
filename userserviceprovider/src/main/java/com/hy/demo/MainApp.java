package com.hy.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @Auther: heyong
 * @Date: 2020/2/17 23:18
 * @Description:
 */
public class MainApp {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("provider.xml");
        ioc.start();

        int read = System.in.read();
    }
}
