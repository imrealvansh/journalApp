package com.vansh.journalApp.Service;

import com.vansh.journalApp.Repository.UserRepository;
import com.vansh.journalApp.entity.User;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@Disabled
@SpringBootTest
public class UserServiceTests {

    @Autowired
    private UserRepository userRepository;


    @Disabled
    @ParameterizedTest
    @ValueSource( strings={
        "ram",
            "shyam",
                "Vansh"
    })
    public void testFindByUserName(String name) {
        assertNotNull(userRepository.findByUserName(name));
    }

    @Disabled
    @ParameterizedTest
    @CsvSource({
            "1,1,2",
            "2,10,12",
            "3,3,9"
    })
    public void test(int a, int b, int expected){
        assertEquals(expected, a + b);
    }
}