package com.polytech.Polynet.repository;

import com.polytech.Polynet.business.User;

public interface UserRepository {
    User findByUsername(String username);
}
