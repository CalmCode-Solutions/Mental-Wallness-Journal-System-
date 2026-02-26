package edu.icet.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JournalRequestDTO {

    @NotNull(message = "User ID is required")
    private Long userId;

    @NotBlank(message = "Journal content cannot be empty")
    private String content;
}
