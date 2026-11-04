package com.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {


    @Bean

    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http
                .csrf(csrf -> csrf.disable())
                .authorizeHttpRequests(authorizeRequests ->
                        authorizeRequests.requestMatchers("/public/**")
                                .permitAll()

                                .requestMatchers(HttpMethod.GET,"/students/**")
                                .hasAnyRole("ADMIN","TEACHER","STUDENT")

                                .requestMatchers(HttpMethod.POST,"/students/**")
                                .hasAnyRole("ADMIN","TEACHER")

                                .requestMatchers(HttpMethod.PUT,"/students/**")
                                .hasAnyRole("ADMIN","TEACHER")

                                .requestMatchers(HttpMethod.DELETE,"/students/**")
                                .hasAnyRole("ADMIN")

                                .anyRequest().authenticated()

                )
                .httpBasic(httpBasic->{});
        return http.build();

    }

    @Bean

public PasswordEncoder passwordEncoder(){
    return new BCryptPasswordEncoder();
    }
}
