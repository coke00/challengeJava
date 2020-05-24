package com.amaris.challenge.service.impl;

import com.amaris.challenge.pojo.User;
import com.amaris.challenge.repository.CommentRepository;
import com.amaris.challenge.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    CommentRepository commentRepository;
    @Override
    public List<User> createUser(List<User> users) {
        users.add(new User(users.size()+1, commentRepository.getComments(1)));

        return users;
    }
}
