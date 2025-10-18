package com.kyuubi.angatbuhat.dto.response;

import com.kyuubi.angatbuhat.model.Roles;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserResponse {
    private Long id;
    private String username;
    private String email;
    private Roles role;
}
