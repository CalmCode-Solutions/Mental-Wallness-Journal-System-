package edu.icet.service.impl;

import edu.icet.entity.Recommendation;
import edu.icet.repository.RecommendationRepository;
import edu.icet.service.RecommendationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
@RequiredArgsConstructor
public class RecommendationServiceImpl implements RecommendationService {
    private final RecommendationRepository recommendationRepository;
    @Override
    public List<Recommendation> getRecommendationsByMood(String mood) {
        return recommendationRepository.findByMoodTypeIgnoreCase(mood);
    }
}

