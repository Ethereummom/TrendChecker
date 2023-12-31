package com.pingpong.jlab.pingpong.global.security.provider;

import org.springframework.security.core.AuthenticationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.pingpong.jlab.pingpong.global.security.service.userdetails.CustomUserDetails;


@Component
public class CustomAuthenticationProvider implements AuthenticationProvider{


    @Autowired
    private UserDetailsService userDetailsService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public Authentication authenticate(Authentication authentication)throws AuthenticationException{
        String username = authentication.getName();
        String password = (String)authentication.getCredentials();

        CustomUserDetails customUserDetails = (CustomUserDetails)userDetailsService.loadUserByUsername(username);

        if(!passwordEncoder.matches(password, customUserDetails.getPassword())){
            throw new BadCredentialsException("비밀번호가 일치하지 않습니다.");
        }
    
        return new UsernamePasswordAuthenticationToken(customUserDetails.getUsername(),password,customUserDetails.getAuthorities());
    }

    @Override
    public boolean supports(Class<?> authentication){
        return authentication.equals(UsernamePasswordAuthenticationToken.class);
    }
    
}
