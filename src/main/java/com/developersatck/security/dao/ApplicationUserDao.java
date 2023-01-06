package com.developersatck.security.dao;

import com.developersatck.security.dto.ApplicationUser;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Optional;

public interface ApplicationUserDao {
    public Optional<ApplicationUser> findApplicationUserByUsername(String username);
}
