package com.pingpong.jlab.pingpong.domain.post.dto;

import com.pingpong.jlab.pingpong.domain.post.entity.Post;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class PostDto {


    private String title;
    private String content;
    private String category;



    public Post dtoToEntity(PostDto dto){

        Post post = new Post();

        post.setTitle(dto.getTitle());
        post.setContent(dto.getContent());
        post.setCategory(dto.getCategory());

        return post;

    }
    
}

