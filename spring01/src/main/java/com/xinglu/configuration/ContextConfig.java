package com.xinglu.configuration;

import com.xinglu.controller.BookController;
import com.xinglu.domain.Person;
import com.xinglu.service.BookService;
import org.junit.experimental.theories.FromDataPoints;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Configuration
@ComponentScan(value = "com.xinglu",includeFilters = {
//        @ComponentScan.Filter(value = {Controller.class}),
//        @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,value = {BookService.class})
            @ComponentScan.Filter(type = FilterType.CUSTOM,value = {MyTypeFilter.class})
},useDefaultFilters = false)
public class ContextConfig {
    @Lazy
    @Scope("singleton")
    @Bean("person")
    public Person person(){
        Person person = new Person();
        person.setName("xinglu");
        person.setAge(25);
        System.out.println("创建对象");
        return person;
    }
}
