package edu.icet.service;

import edu.icet.entity.Recommendation;

import java.util.List;

public interface RecommendationService {
    List<Recommendation> getRecommendationsByMood(String mood);
}
