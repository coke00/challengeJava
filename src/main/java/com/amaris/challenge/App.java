package com.amaris.challenge;

import com.amaris.challenge.pojo.Comment;
import com.amaris.challenge.pojo.User;
import com.amaris.challenge.repository.CommentRepository;
import com.amaris.challenge.service.UserService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class App {

    public static void main(String[] args) {
        UserService userService = new UserService() {
            @Override
            public List<User> createUser(List<User> users) {
                List<Comment> commentList = new ArrayList<>();
                commentList.add(new Comment(2,2,"comentario3"));
                users.add(new User(users.size() + 1, commentList));
                return null;
            }
        };

        List<User> users = new ArrayList<User>();
        userService.createUser(users);
        System.out.println(users.get(0).getComments().get(0).getText());
    }

   /*private static void createUser(List<User> users) {
        users.add(new User(users.size() + 1));

    }*/
}
