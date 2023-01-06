package com.developersatck.security.dao;

import org.springframework.security.core.userdetails.UserDetails;

import java.util.Optional;

public interface ApplicationUserDao {
    public Optional<UserDetails> findApplicationUserByUsername(String username);
}
