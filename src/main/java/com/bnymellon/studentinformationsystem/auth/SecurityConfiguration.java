package com.bnymellon.studentinformationsystem.auth;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {

    @Bean
    InMemoryUserDetailsManager users() {
        UserDetails admin = User.withDefaultPasswordEncoder()
                .username("admin").password("password")
                .roles("ADMIN", "USER").build();
        UserDetails teacher = User.withDefaultPasswordEncoder()
                .username("teacher").password("password")
                .roles("TEACHER", "USER").build();
        UserDetails user = User.withDefaultPasswordEncoder()
                .username("user").password("password")
                .roles("USER").build();
        return new InMemoryUserDetailsManager(admin, teacher, user);
    }
}
