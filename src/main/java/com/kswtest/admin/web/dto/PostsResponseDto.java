package com.kswtest.admin.web.dto;

import com.kswtest.admin.domain.Posts.posts;
import lombok.Getter;


@Getter
public class PostsResponseDto {

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getAuthor() {
        return author;
    }

    private Long id;
    private String title;
    private String content;
    private String author;

    public PostsResponseDto(posts entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.author = entity.getAuthor();
    }
}
