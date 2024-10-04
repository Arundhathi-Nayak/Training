package com.demo.springaop.aop;

import com.demo.springaop.aop.repository.ConsoleInterface;
import com.demo.springaop.aop.service.ConsoleService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass=true)
public class AopBankingApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(AopBankingApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        ConsoleInterface consoleInterface=new ConsoleService();
        boolean running=true;
        while (running) {
            running=consoleInterface.displayMenu();
        }

    }
}
