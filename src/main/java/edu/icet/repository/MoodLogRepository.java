package edu.icet.repository;

import edu.icet.entity.MoodLog;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface MoodLogRepository extends JpaRepository<MoodLog, Long> {
    List<MoodLog> findByUserUserId(Long userId);
}