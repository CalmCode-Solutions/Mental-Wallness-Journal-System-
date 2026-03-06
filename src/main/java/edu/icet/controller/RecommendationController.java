package edu.icet.controller;

import edu.icet.entity.Recommendation;
import edu.icet.service.RecommendationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/recommendations")
@RequiredArgsConstructor
public class RecommendationController {

    private final RecommendationService recommendationService;

    // 🔹 Get Recommendations By Mood
    @GetMapping("/{mood}")
    public ResponseEntity<List<Recommendation>> getByMood(
            @PathVariable String mood) {

        return ResponseEntity.ok(
                recommendationService.getRecommendationsByMood(mood)
        );
    }
}
