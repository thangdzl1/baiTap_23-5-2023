package com.example.baiTapNop_2352023.demo.config;

import com.example.baiTapNop_2352023.demo.model.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class CustomConfig {
    @Bean
    public List<StudentModel> studentModelList(){
        List <StudentModel> list = new ArrayList<>();
        return list;
    }

}
