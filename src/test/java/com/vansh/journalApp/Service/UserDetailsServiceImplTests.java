package com.vansh.journalApp.Service;

import com.vansh.journalApp.Repository.UserRepository;
import com.vansh.journalApp.entity.User;
import org.junit.jupiter.api.*;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

import static org.mockito.Mockito.when;

@Disabled
public class UserDetailsServiceImplTests  {
    @InjectMocks
    private UserDetailsServiceImpl userDetailsService;

    @Mock
    private UserRepository userRepository;

    @BeforeEach
    void setup(){
        MockitoAnnotations.initMocks(this);
    }
    @Disabled
    @Test
    void loadUserByUsernameTest(){
        when(userRepository.findByUserName(ArgumentMatchers.anyString())).thenReturn(User.builder().userName("Vansh").password("sncsnbcuwdw").roles(new ArrayList<>()).build());
        UserDetails user = userDetailsService.loadUserByUsername("Vansh");
        Assertions.assertNotNull(user);
    }
}
