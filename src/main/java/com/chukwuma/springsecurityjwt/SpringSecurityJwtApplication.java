package com.chukwuma.springsecurityjwt;

import com.chukwuma.springsecurityjwt.entity.User;
import com.chukwuma.springsecurityjwt.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
//@EnableSwagger2
public class SpringSecurityJwtApplication {


    @Autowired
    private UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityJwtApplication.class, args);
    }


    @PostConstruct
    public void init(){

        List<User> users = Stream.of(
                new User(1,"chukwuma","chuks","chukwuma@chuks.com"),
                new User(2,"chijindu","cj","chijindu@cj.com"),
                new User(3,"david","orji","david@orji.com"),
                new User(4,"stella","baby","stella@baby.com")
        ).collect(Collectors.toList());
        userRepository.saveAll(users);
    }





}
