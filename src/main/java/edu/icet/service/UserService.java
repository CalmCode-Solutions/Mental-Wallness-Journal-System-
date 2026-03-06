package edu.icet.service;

import edu.icet.dto.UserLoginDTO;
import edu.icet.dto.UserRegisterDTO;
import edu.icet.dto.UserResponseDTO;

public interface UserService {
    UserResponseDTO register(UserRegisterDTO dto);

    UserResponseDTO login(UserLoginDTO dto);
}

