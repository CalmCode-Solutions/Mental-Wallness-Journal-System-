package edu.icet.controller;

import edu.icet.dto.UserLoginDTO;
import edu.icet.dto.UserRegisterDTO;
import edu.icet.dto.UserResponseDTO;
import edu.icet.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping("/register")
    public ResponseEntity<UserResponseDTO> register(
            @RequestBody UserRegisterDTO dto) {

        return ResponseEntity.ok(userService.register(dto));
    }
    @PostMapping("/login")
    public ResponseEntity<UserResponseDTO> login(
            @RequestBody UserLoginDTO dto) {

        return ResponseEntity.ok(userService.login(dto));
    }
}
