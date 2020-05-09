package com.kedacom;

import com.kedacom.configuration.PersonConfiguration;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootKedaApplicationTests {
    @Autowired
    private PersonConfiguration personConfiguration;

   @Test
    public void contextLoads() {
       System.out.println("555555555");
        System.out.println(personConfiguration.toString());
    }

}
