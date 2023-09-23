package com.deeplify.tutorial.oauthlogin.config.security;

import com.deeplify.tutorial.oauthlogin.oauth.token.AuthTokenProvider;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JwtConfig {

    private String secret = "8sknjlO3NPTBqo319DHLNqsQAfRJEdKsETOds";

    @Bean
    public AuthTokenProvider jwtProvider() {
        return new AuthTokenProvider(secret);
    }
}
