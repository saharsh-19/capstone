package com.example.demo.security;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Component;

import jakarta.servlet.ServletRequest;

import java.util.Date;

@Component
public class JwtTokenUtil {

    private final String SECRET_KEY = "secret12332897749823892fjdhfgjhkrerfioutfriou";  // Replace with a stronger secret key
    private final long EXPIRATION_TIME = 86400000L;  // Token expiration time in milliseconds (24 hours)

    // Generate JWT token
    public String generateToken(String username) {
        return Jwts.builder()
                .setSubject(username)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
                .signWith(SignatureAlgorithm.HS256, SECRET_KEY)
                .compact();
    }

    // Get username from the JWT token
    public String getUsernameFromToken(String token) {
        Claims claims = Jwts.parserBuilder()
                .setSigningKey(SECRET_KEY)
                .build()
                .parseClaimsJws(token)
                .getBody();
        return claims.getSubject();
    }

    // Validate the JWT token
    public boolean validateToken(String token) {
        try {
            Jwts.parserBuilder()
                    .setSigningKey(SECRET_KEY)
                    .build()
                    .parseClaimsJws(token);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    // Extract token from the HTTP request header
    public String getTokenFromRequest(ServletRequest request) {
        String token = null;
        String header = ((jakarta.servlet.http.HttpServletRequest) request).getHeader("Authorization");

        if (header != null && header.startsWith("Bearer ")) {
            token = header.substring(7);  // Remove "Bearer " prefix
        }

        return token;
    }
}
