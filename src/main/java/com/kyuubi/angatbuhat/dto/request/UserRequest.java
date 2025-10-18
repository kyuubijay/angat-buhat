package com.kyuubi.angatbuhat.dto.request;

import com.kyuubi.angatbuhat.model.Roles;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class UserRequest {

    @NotNull(message = "Username is required")
    private String username;

    @Email()
    private String email;

    @NotNull(message = "Password is required")
    private String password;

    @NotNull(message = "Role is required")
    private Roles role;
}
