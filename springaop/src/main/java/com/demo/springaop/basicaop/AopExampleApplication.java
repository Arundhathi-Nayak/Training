package com.demo.springaop.basicaop;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AopExampleApplication {
    public static void main(String[] args) {
        SpringApplication.run(AopExampleApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(UserService userService) {
        return args -> {
            userService.createUser("john_doe");
            userService.deleteUser("john_doe");
        };
    }
}
