package com.demo.springaop.basicaop;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    public void createUser(String username){
        System.out.println("User created: "+username);
    }
    public void deleteUser(String username){
        System.out.println("User deleted: "+username);
    }
}
