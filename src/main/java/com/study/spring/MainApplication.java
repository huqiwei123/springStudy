package com.study.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.Environment;

import java.util.Map;

public class MainApplication {

    public static void main(String[] args) {
	  ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    }
}
