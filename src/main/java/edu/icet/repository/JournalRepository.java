package edu.icet.repository;

import edu.icet.entity.Journal;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface JournalRepository extends JpaRepository<Journal, Long> {

    List<Journal> findByUserUserId(Long userId);
}

