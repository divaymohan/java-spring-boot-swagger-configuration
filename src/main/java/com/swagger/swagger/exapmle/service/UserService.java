package com.swagger.swagger.exapmle.service;

import com.swagger.swagger.exapmle.dao.User;
import com.swagger.swagger.exapmle.exception.UserNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    ArrayList<User> data;

    public UserService(){
        this.data = new ArrayList<User>();
        User user = User.builder().userId(1L).userEmail("dm@gmail.com").userPhoneNumber("23444555").build();
        this.data.add(user);
    }

    public List<User> getUsers(){
        return this.data;
    }

    public User getUserById(Long id) {
        for(User user: data){
            if(user.getUserId() == id){
                return user;
            }
        }
        throw new UserNotFoundException("User Not Found");
    }

    public void addUser(User user) {
        data.add(user);
    }
}
