package com.yash.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.yash.bean.Person;
import com.yash.bean.User;
import com.yash.services.PersonService;
import com.yash.services.UserService;

//import com.yash.bean.Person;

//import com.yash.bean.Person;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
//@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class UserController {
 
	@Autowired(required=true)
    UserService userService;

    @GetMapping("/users")
    private List<User> getAllUsers() {
    	 
        return userService.getAllUsers();
    }

    @GetMapping("/users/{id}")
    private User getPerson(@PathVariable("id") int id) {
        return userService.getUserById(id);
    }

    @DeleteMapping("/users/{id}")
    private void deleteUser(@PathVariable("id") int id) {
    	userService.delete(id);
    }

    @PostMapping("/users")
    private int saveUser(@RequestBody User user) {
    	userService.saveOrUpdate(user);
        return user.getId();
    }
}