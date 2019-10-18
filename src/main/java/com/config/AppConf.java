package com.config;

import com.entity.Person;
import com.entity.Role;
import com.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConf {

    @Bean
    public User getUser(){
        User user = new User();
        user.setUserName("yangcan");
        user.setPassword("123");
        return user;
    }

    @Bean
    public Role getRole(){
        Role role = new Role();
        role.setId(1);
        role.setRoleId("121331");
        role.setDescription("This is your role!");
        return role;
    }
    @Bean
    public Person getPerson(){
        Person person = new Person();
        person.setRole(getRole());
        person.setUser(getUser());
        return person;
    }

}
