package com.noob.uaa.service;

import com.noob.uaa.entity.User;

public interface UserService {

    User getByUsername(String username);

    User getByLogin();
}
