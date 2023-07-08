package com.bmc.sfg.brewery.eureka.msscbreweryeureka.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

import javax.servlet.Filter;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author Masoumeh Yeganeh
 * @created 05/07/2023
 */
@Configuration
public class SecurityConfig {

    @Bean
    SecurityFilterChain defaultSecure(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .authorizeRequests()
                .anyRequest().authenticated()
                .and()
                .httpBasic();
        return http.build();
    }
}
