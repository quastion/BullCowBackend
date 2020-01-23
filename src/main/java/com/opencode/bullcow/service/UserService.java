package com.opencode.bullcow.service;

import com.opencode.bullcow.entity.User;
import com.opencode.bullcow.repository.UserRepository;
import com.opencode.bullcow.util.HTTPResponse;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class UserService {
    private UserRepository repository;

    @Autowired
    public void setProductRepository(UserRepository repository) {
        this.repository = repository;
    }

    public HTTPResponse register(User entity) {
        BCryptPasswordEncoder d = new BCryptPasswordEncoder();
        entity.setPassword(d.encode(entity.getPassword()));

        try{
            repository.save(entity);
            return new HTTPResponse("OK", "");
        } catch(Exception e) {
            return new HTTPResponse("ERROR", e.getCause().getCause().getMessage());
        }
    }
}
