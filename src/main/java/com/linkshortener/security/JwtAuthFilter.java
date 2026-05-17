package com.linkshortener.security;

import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

@Component
public interface JwtAuthFilter extends OncePerRequestFilter {

}
