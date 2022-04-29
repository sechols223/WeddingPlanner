package com.github.sechols22.weddingplanner.configurations;

import com.github.sechols22.weddingplanner.controllers.LogoutHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
public class WebSecurity extends WebSecurityConfigurerAdapter {


    private final LogoutHandler logoutHandler;

    @Autowired
    public WebSecurity(LogoutHandler logoutHandler) {
        this.logoutHandler = logoutHandler;
    }

    @Override
    public void configure(HttpSecurity http) throws Exception {

        http
                .oauth2Login()
                .and().logout()
                .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
                .addLogoutHandler(logoutHandler);


    }
}
