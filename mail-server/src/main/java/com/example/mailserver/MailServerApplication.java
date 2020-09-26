package com.example.mailserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MailServerApplication {

    //增加邮件功能
    public static void main(String[] args) {
        SpringApplication.run(MailServerApplication.class, args);
    }

}
