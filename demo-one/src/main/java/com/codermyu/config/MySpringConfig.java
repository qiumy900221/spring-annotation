package com.codermyu.config;

import com.codermyu.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/** @author Mingyu */
@Configuration
public class MySpringConfig {
  @Bean
  public Person person() {
    return new Person("Tom", 18);
  }
}
