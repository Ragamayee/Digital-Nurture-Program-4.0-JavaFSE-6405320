package com.cognizant.spring_learn.controller;

import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;


import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

import java.security.Key;
import java.util.Date;
import io.jsonwebtoken.JwtBuilder;



@RestController
public class AuthenticationController {

    private static final Logger LOGGER = LoggerFactory.getLogger(AuthenticationController.class);

    @GetMapping("/authenticate")
    public Map<String, String> authenticate(@RequestHeader("Authorization") String authHeader) {
        LOGGER.info("START: authenticate()");
        LOGGER.debug("Authorization Header: {}", authHeader);

        String user = getUser(authHeader);
        String token = generateJwt(user);

        Map<String, String> map = new HashMap<>();
        map.put("token", token);

        LOGGER.info("END: authenticate()");
        return map;
    }

    private String getUser(String authHeader) {
        LOGGER.debug("START: getUser()");
        String encodedCredentials = authHeader.substring("Basic ".length());
        byte[] decodedBytes = Base64.getDecoder().decode(encodedCredentials);
        String decodedCredentials = new String(decodedBytes);
        LOGGER.debug("Decoded credentials: {}", decodedCredentials);

        String username = decodedCredentials.split(":")[0];
        LOGGER.debug("Extracted username: {}", username);
        LOGGER.debug("END: getUser()");
        return username;
    }

    private String generateJwt(String user) {
        LOGGER.debug("START: generateJwt()");
        Key key = Keys.hmacShaKeyFor("your-32-char-secret-key-goes-here!".getBytes());

        String token = Jwts.builder()
                .setSubject("user")
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 1200000)) // 20 mins
                .signWith(key, SignatureAlgorithm.HS256) // only works in 0.11.0+
                .compact();
        LOGGER.debug("Generated Token: {}", token);
        LOGGER.debug("END: generateJwt()");
        return token;
    }
}
