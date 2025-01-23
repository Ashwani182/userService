package com.expense.tracker.userService.configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //configuration run first and @Bean annotation makes bean and store in context
public class UserServiceConfig {

    @Bean
    public ObjectMapper objectMapper(){
        return  new ObjectMapper();
    }

}
