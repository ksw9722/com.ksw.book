package com.kswtest.admin.web.dto;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
@Getter
@NoArgsConstructor
public class PostsUpdateRequestDto {
    public String getTitle() {
        return title;
    }

    private String title;

    public String getContent() {
        return content;
    }

    private String content;

    @Builder
    public PostsUpdateRequestDto(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
