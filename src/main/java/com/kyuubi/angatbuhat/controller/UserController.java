package com.kyuubi.angatbuhat.controller;

import com.kyuubi.angatbuhat.dto.request.UserRequest;
import com.kyuubi.angatbuhat.dto.response.UserResponse;
import com.kyuubi.angatbuhat.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    public ResponseEntity<UserResponse> createUser(@RequestBody @Validated UserRequest userRequest) {
        return userService.createUser(userRequest);
    }
}

