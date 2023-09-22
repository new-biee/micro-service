package com.noob.post.repo.client;

import org.apache.catalina.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "uaa", url = "${application.config.uaa-url}")
public interface UserRepository {

    @GetMapping("/api/internal/uaa/login}")
    User getUserByLogin();
}
