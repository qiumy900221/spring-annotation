package com.codermyu;

import com.codermyu.bean.Person;
import com.codermyu.config.MySpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/** @author Mingyu */
public class App {
  public static void main(String[] args) {
    /**
     * 通过AnnotationConfigApplicationContext读取配置类并创建IoC容器
     * IoC容器在启动时会调用配置类中的person()方法，并将方法返回的组件注册到IoC容器中
     */
    ApplicationContext applicationContext =
        new AnnotationConfigApplicationContext(MySpringConfig.class);
    Person person = applicationContext.getBean("person", Person.class);
    System.out.println(person);
  }
}
