package com.kyuubi.angatbuhat.service;

import com.kyuubi.angatbuhat.dto.request.UserRequest;
import com.kyuubi.angatbuhat.dto.response.UserResponse;
import com.kyuubi.angatbuhat.exception.AngatBuhatUserNotFoundException;
import com.kyuubi.angatbuhat.model.Roles;
import com.kyuubi.angatbuhat.model.User;
import com.kyuubi.angatbuhat.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public UserResponse getUserById(Long id) {
        Optional<User> optionalUser = userRepository.findById(id);

        if (optionalUser.isEmpty()) {
            throw new AngatBuhatUserNotFoundException("User not found");
        }

        User user = optionalUser.get();
        return UserResponse.builder()
                .id(user.getId())
                .username(user.getUsername())
                .email(user.getEmail())
                .role(user.getRole())
                .build();
    }

    public UserResponse getUserByUsername(String username) {
        Optional<User> optionalUser = userRepository.findByUsername(username);

        if (optionalUser.isEmpty()) {
            throw new AngatBuhatUserNotFoundException("User not found");
        }

        User user = optionalUser.get();
        return UserResponse.builder()
                .id(user.getId())
                .username(user.getUsername())
                .email(user.getEmail())
                .role(user.getRole())
                .build();
    }

    public UserResponse getUserByEmail(String email) {
        Optional<User> optionalUser = userRepository.findByEmail(email);

        if (optionalUser.isEmpty()) {
            throw new AngatBuhatUserNotFoundException("User not found");
        }

        User user = optionalUser.get();
        return UserResponse.builder()
                .id(user.getId())
                .username(user.getUsername())
                .email(user.getEmail())
                .role(user.getRole())
                .build();
    }

    public UserResponse createUser(UserRequest userRequest) {
        User user = User.builder()
                .username(userRequest.getUsername())
                .email(userRequest.getEmail())
                .role(Roles.USER)
                .build();
        user = userRepository.save(user);
        return UserResponse.builder()
                .id(user.getId())
                .username(user.getUsername())
                .email(user.getEmail())
                .role(user.getRole())
                .build();
    }
}
