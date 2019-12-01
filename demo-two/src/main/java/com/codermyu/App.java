package com.codermyu;

import com.codermyu.config.MySpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/** @author Mingyu */
public class App {
  public static void main(String[] args) {
    AnnotationConfigApplicationContext applicationContext =
        new AnnotationConfigApplicationContext(MySpringConfig.class);
    String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
    for (String beanDefinitionName : beanDefinitionNames) {
      System.out.println(beanDefinitionName);
    }
  }
}
