package com.developersatck.security.config.security;

import com.developersatck.security.config.permission.ApplicationUserPermission;
import com.developersatck.security.config.permission.ApplicationUserRole;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import static com.developersatck.security.config.permission.ApplicationUserPermission.PRODUCT_WRITE;
import static com.developersatck.security.config.permission.ApplicationUserRole.*;

@Configuration
@EnableWebSecurity
public class ApplicationSecurityConfig extends WebSecurityConfigurerAdapter {

    private final PasswordEncoder passwordEncoder;

    public ApplicationSecurityConfig(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.
                csrf().disable()
                .authorizeRequests()
                .antMatchers("/", "index").permitAll()
                .antMatchers("/api/v1/**").hasRole(USER.name())
                .antMatchers(HttpMethod.GET, "member/api/v1/**").hasAnyRole(ADMIN.name(), MANAGER.name())
                .antMatchers(HttpMethod.DELETE, "member/api/v1/**").hasAuthority(PRODUCT_WRITE.name())
                .antMatchers(HttpMethod.PUT, "member/api/v1/**").hasAuthority(PRODUCT_WRITE.name())
                .antMatchers(HttpMethod.POST, "member/api/v1/**").hasAuthority(PRODUCT_WRITE.name())
                .anyRequest()
                .authenticated()
                .and()
                .httpBasic();
    }

    @Override
    @Bean
    protected UserDetailsService userDetailsService() {

        UserDetails tharaka = User.builder()
                .username("tharaka")
                .password(passwordEncoder.encode("1234"))
                .roles(USER.name())
                .authorities()
                .build();
        UserDetails ayesh = User.builder()
                .username("ayesh")
                .password(passwordEncoder.encode("1234"))
                .roles(MANAGER.name())
                .build();
        UserDetails nalaka = User.builder()
                .username("nalaka")
                .password(passwordEncoder.encode("1234"))
                .roles(ADMIN.name())
                .build();

        return new InMemoryUserDetailsManager(
                tharaka, ayesh, nalaka
        );

    }
}
