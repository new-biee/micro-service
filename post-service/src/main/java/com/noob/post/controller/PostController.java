package com.noob.post.controller;

import com.noob.post.utils.response.APIResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/posts")
public class PostController {

    @GetMapping("/test")
    public APIResponse apiTest(){
        return APIResponse.newSuccessResponse("Test.................");
    }
}
