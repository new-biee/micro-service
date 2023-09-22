package com.noob.uaa.controller;

import com.noob.uaa.entity.User;
import com.noob.uaa.response.APIResponse;
import com.noob.uaa.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/internal")
public class InternalController {

    private final UserService userService;

    public InternalController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/uaa/login")
    public APIResponse<?> getUserLogin(){
        User user = userService.getByLogin();

        return APIResponse.newSuccessResponse(user);
    }
}
