package edu.icet.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SentimentResponseDTO {
    private String mood;
    private Double score;
    private String confidence;
}
