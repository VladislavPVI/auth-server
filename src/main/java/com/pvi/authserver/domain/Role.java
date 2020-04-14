package com.pvi.authserver.domain;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {
    USER, ADMIN, BOT;

    @Override
    public String getAuthority() {
        return name();
    }
}