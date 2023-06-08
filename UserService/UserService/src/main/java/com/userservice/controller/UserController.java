package com.userservice.controller;


import com.userservice.entities.User;
import com.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;
//Create the user

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user) {
       User user1 = userService.saveUser(user);
       return ResponseEntity.status(HttpStatus.CREATED).body(user1);
    }

//    create single user get

    @GetMapping("/{userId}")
    public ResponseEntity<User>getSingleUser(@PathVariable  String userId){
        User user = userService.getUser(userId);
        return ResponseEntity.ok(user);
    }

    @GetMapping("/allusers")
        public ResponseEntity<List<User>> getUser(){
        List<User> allUser = userService.getAllUser();
        return ResponseEntity.ok(allUser);
    }



}
