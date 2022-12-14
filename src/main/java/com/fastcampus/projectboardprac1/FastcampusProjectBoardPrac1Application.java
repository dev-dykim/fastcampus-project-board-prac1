package com.fastcampus.projectboardprac1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan
@SpringBootApplication
public class FastcampusProjectBoardPrac1Application {

    public static void main(String[] args) {
        SpringApplication.run(FastcampusProjectBoardPrac1Application.class, args);
    }

}
