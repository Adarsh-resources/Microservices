package com.userservice.service;

import com.userservice.entities.User;

import java.util.List;

public interface UserService {
    //create
    User saveUser(User user) ;

//    get all user
    List<User>getAllUser();
//    get single user of given userId
    User getUser(String userId);

//    ToDo: Delete
//    ToDo;Update




}
