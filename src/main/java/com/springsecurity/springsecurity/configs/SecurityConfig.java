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
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

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
        httpSecurity.httpBasic(); // Rest based authentication
        //httpSecurity.formLogin();// Web based authentication
        httpSecurity.authorizeHttpRequests().anyRequest().authenticated();
        httpSecurity.addFilterBefore(new CustomFilter(), BasicAuthenticationFilter.class);
        return httpSecurity.build();
    }
}
