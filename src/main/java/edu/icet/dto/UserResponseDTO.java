package edu.icet.dto;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
@Builder
public class UserResponseDTO {
    private Long userid;
    private String username;
    private String email;
    private LocalDateTime  createdAt;

}
