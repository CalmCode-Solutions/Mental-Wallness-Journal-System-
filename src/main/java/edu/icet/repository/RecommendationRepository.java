package edu.icet.repository;

import edu.icet.entity.Recommendation;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface RecommendationRepository extends JpaRepository<Recommendation, Long> {
    List<Recommendation> findByMoodTypeIgnoreCase(String moodType);
}