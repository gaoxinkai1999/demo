package com.example.forestmaster;

import com.alibaba.fastjson.JSONObject;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;

@SpringBootTest
//@EnableConfigurationProperties
class ForestMasterApplicationTests {
@Autowired
MyClient myClient;

@Autowired
User user;
    @Test

    void contextLoads() {

        System.out.println(user.getName());
//        System.out.println(new User());
    }

}
