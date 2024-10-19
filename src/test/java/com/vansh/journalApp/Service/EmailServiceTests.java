package com.vansh.journalApp.Service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EmailServiceTests {
    @Autowired
    private EmailServices emailServices;

    @Test
    void sendMail(){
        emailServices.sendEmail("vanshpratap100@gmail.com", "Test for Journal App", "Hello, Vansh this side.");
        emailServices.sendEmail("vanshpratap0110@gmail.com", "Test for Journal App", "Hello, Vansh this side.");
    }
}
