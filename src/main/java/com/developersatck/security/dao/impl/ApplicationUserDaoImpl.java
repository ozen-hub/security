package com.developersatck.security.dao.impl;

import com.developersatck.security.dao.ApplicationUserDao;
import com.developersatck.security.dto.ApplicationUser;
import com.google.common.collect.Lists;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;
import java.util.Optional;

public class ApplicationUserDaoImpl implements ApplicationUserDao {
    /*actual database*/

    private final PasswordEncoder passwordEncoder;

    public ApplicationUserDaoImpl(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public Optional<UserDetails> findApplicationUserByUsername(String username) {
        return Optional.empty();
    }

    private List<ApplicationUser> geApplicationUsers(){
        List<ApplicationUser> applicationUsers = Lists.newArrayList(
               new ApplicationUser(),
               new ApplicationUser(),
               new ApplicationUser()
        );
        return applicationUsers;
    }

}
