package com.amaris.challenge.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comment {
    private Integer userId;
    private Integer id;
    private String text;
    public Comment(Integer id, String text, Integer userId){
        this.id = id;
        this.text = text;
        this.userId = userId;
    }
}
