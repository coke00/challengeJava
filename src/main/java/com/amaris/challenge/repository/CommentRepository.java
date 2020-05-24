package com.amaris.challenge.repository;

import com.amaris.challenge.pojo.Comment;

import java.util.ArrayList;
import java.util.List;

public class CommentRepository implements ICommentRepository{
    public static List<Comment> getComments(Integer id){
        List<Comment> comments = new ArrayList<Comment>();
        comments.add(new Comment(comments.size() + 1, "comentario " + (comments.size() + 1), id));
        comments.add(new Comment(comments.size() + 1, "comentario " + (comments.size() + 1), id));
        comments.add(new Comment(comments.size() + 1, "comentario " + (comments.size() + 1), id));
        comments.add(new Comment(comments.size() + 1, "comentario " + (comments.size() + 1), id));
        comments.add(new Comment(comments.size() + 1, "comentario " + (comments.size() + 1), id));
        return comments;
    }
}
