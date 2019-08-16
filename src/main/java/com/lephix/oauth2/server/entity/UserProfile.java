package com.lephix.oauth2.server.entity;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class UserProfile {
    private String name;
    private String email;
}