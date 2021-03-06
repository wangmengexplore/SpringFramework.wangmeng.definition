package com.wangmeng.test;

import com.wangmeng.aop.MathCalculator;
import com.wangmeng.bean.Boss;
import com.wangmeng.bean.Car;
import com.wangmeng.bean.Color;
import com.wangmeng.config.MainConfigOfAOP;
import com.wangmeng.config.MainConfigOfAutowired;
import com.wangmeng.service.BookService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTest_AOP {

    @Test
    public void test01(){
        //创建IOC容器
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfAOP.class);
//        MathCalculator mathCalculator = new MathCalculator();
//        mathCalculator.div(1,1);
        MathCalculator mathCalculator = applicationContext.getBean(MathCalculator.class);
        //容器保存了组件的代理对象（cglib增强后的对象）
        mathCalculator.div(1,2);
        applicationContext.close();
    }
}
