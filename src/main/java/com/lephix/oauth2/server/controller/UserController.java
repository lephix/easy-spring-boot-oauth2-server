package com.lephix.oauth2.server.controller;

import com.lephix.easy.security.impl.JdbcUserDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private JdbcUserDetailService jdbcUserDetailService;

    @GetMapping()
    public Map<String, Object> profile() {
        try {
            User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
            return jdbcUserDetailService.findByUsername(user.getUsername());
        } catch (Exception e) {
            throw new RuntimeException("获得当前用户失败:" + e.getMessage());
        }
    }
}
