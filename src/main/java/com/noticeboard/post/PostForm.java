package com.noticeboard.post;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Getter
@Setter
public class PostForm {
    @NotEmpty(message = "제목은 필수항목입니다.")
    @Size(max = 200)
    private String title;

    @NotEmpty(message = "내용은 필수항목입니다.")
    private String content;
}
