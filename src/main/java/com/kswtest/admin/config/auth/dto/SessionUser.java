package com.kswtest.admin.config.auth.dto;

import com.kswtest.admin.domain.user.kuser;
import lombok.Getter;

import java.io.Serializable;
@Getter
public class SessionUser implements Serializable {
    private String name;
    private String email;
    private String picture;

    public SessionUser(kuser user){
        this.name = user.getName();
        this.email = user.getEmail();
        this.picture = user.getPicture();
    }
}
