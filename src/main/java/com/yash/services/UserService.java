package com.yash.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.bean.Person;
import com.yash.bean.User;
import com.yash.repository.PersonRepository;
import com.yash.repository.UserRepository;

@Service
public class UserService {

    @Autowired(required=true)
    UserRepository userRepository;

    public List<User> getAllUsers() {
        List<User> users = new ArrayList<User>();
        userRepository.findAll().forEach(user -> users.add(user));
        return users;
    }

    public User getUserById(int id) {
        return userRepository.findById(id).get();
    }

    public void saveOrUpdate(User user) {
    	userRepository.save(user);
    }

    public void delete(int id) {
    	userRepository.deleteById(id);
    }
}