package com.springsecurity.springsecurity.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

//    @Bean
//    UserDetailsService userDetailsService(){
//        InMemoryUserDetailsManager userDetailService = new InMemoryUserDetailsManager();
//        UserDetails user = User.withUsername("root")
//                .password(passwordEncoder().encode("root")).authorities("read").build();
//        userDetailService.createUser(user);
//        return userDetailService;
//    }

//    @Bean
//    BCryptPasswordEncoder passwordEncoder(){
//        return new BCryptPasswordEncoder();
//    }
    @Bean
    SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception{
        httpSecurity.httpBasic();
        httpSecurity.authorizeHttpRequests().anyRequest().authenticated();
        return httpSecurity.build();
    }
}
