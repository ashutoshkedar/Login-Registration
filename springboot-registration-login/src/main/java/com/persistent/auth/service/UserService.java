package com.persistent.auth.service;

import com.persistent.auth.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
