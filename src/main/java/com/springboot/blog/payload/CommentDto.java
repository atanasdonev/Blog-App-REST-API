package com.springboot.blog.payload;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
public class CommentDto  {
    
    private long id;

    @NotEmpty(message = "Name cannot not be empty")
    private String name;

    @Email
    @NotEmpty(message = "Email cannot not be empty")
    private String email;

    @NotEmpty
    @Size(min = 10, message = "Comment body must be at least 10 characters")
    private String body;

}
