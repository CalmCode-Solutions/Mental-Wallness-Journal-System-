package edu.icet.dto;

import jakarta.validation.constraints.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class JournalResponseDTO {

    @NotNull
    private Long journalId;

    @NotBlank(message = "Content cannot be blank")
    @Size(max = 1000, message = "Content too long")
    private String content;

    @NotBlank
    private String sentiment;

    @NotNull
    @DecimalMin(value = "0.0", inclusive = true, message = "Score must be >= 0")
    @DecimalMax(value = "1.0", inclusive = true, message = "Score must be <= 1")
    private Float sentimentScore;
}