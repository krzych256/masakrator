package com.game.masakrator.security;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import com.game.masakrator.model.User;
import com.game.masakrator.model.UserAuthority;

public final class JwtUserFactory {

    private JwtUserFactory() {
    }

    public static JwtUser create(User user) {
        return new JwtUser(
                user.getId(),
                user.getUsername(),
                user.getEmail(),
                user.getPassword(),
                mapToGrantedAuthorities(user.getAuthoritis()),
                user.getEnabled(),
                user.getLastPasswordResetDate(),
                user.getPremium(),
                user.getAllPoints()
        );
    }

    private static List<GrantedAuthority> mapToGrantedAuthorities(List<UserAuthority> authorities) {
        return authorities.stream()
                .map(authority -> new SimpleGrantedAuthority(authority.getAuthority().getName().name()))
                .collect(Collectors.toList());
    }
}
