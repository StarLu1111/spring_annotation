package com.xinglu.test;

import com.xinglu.configuration.ContextConfig;
import com.xinglu.domain.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.List;

public class Test1 {

    @Test
    public void test1(){
        ApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(ContextConfig.class);
        String[] beanDefinitionNames = annotationConfigApplicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
        //System.out.println(Arrays.asList(beanDefinitionNames));

    }

    @Test
    public void test(){
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(ContextConfig.class);
        Person person = (Person) applicationContext.getBean("person");
        Person person1 = applicationContext.getBean(Person.class);

        System.out.println(person==person1);
//
//
//        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
//        for (String beanDefinitionName : beanDefinitionNames) {
//            System.out.println(beanDefinitionName);
//        }
//
//        String[] beanNamesForType = applicationContext.getBeanNamesForType(Person.class);
//        List<String> list = Arrays.asList(beanDefinitionNames);
//        System.out.println(list);


    }
}
