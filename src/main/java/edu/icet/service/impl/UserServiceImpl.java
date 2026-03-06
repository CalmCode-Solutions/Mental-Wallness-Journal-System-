package edu.icet.service.impl;

import edu.icet.dto.UserLoginDTO;
import edu.icet.dto.UserRegisterDTO;
import edu.icet.dto.UserResponseDTO;
import edu.icet.entity.User;
import edu.icet.repository.UserRepository;
import edu.icet.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public UserResponseDTO register(UserRegisterDTO dto) {

        if (userRepository.existsByEmail(dto.getEmail())) {
            throw new RuntimeException("Email already exists");
        }

        User user = new User();
        user.setUsername(dto.getUsername());
        user.setEmail(dto.getEmail());
        user.setPassword(dto.getPassword()); 

        userRepository.save(user);

        return UserResponseDTO.builder()
                .userid(user.getUserId())
                .username(user.getUsername())
                .email(user.getEmail())
                .createdAt(user.getCreatedAt())
                .build();
    }

    @Override
    public UserResponseDTO login(UserLoginDTO dto) {

        User user = userRepository.findByEmail(dto.getEmail())
                .orElseThrow(() -> new RuntimeException("User not found"));

        if (!user.getPassword().equals(dto.getPassword())) {
            throw new RuntimeException("Invalid password");
        }

        return UserResponseDTO.builder()
                .userid(user.getUserId())
                .username(user.getUsername())
                .email(user.getEmail())
                .createdAt(user.getCreatedAt())
                .build();
    }
}