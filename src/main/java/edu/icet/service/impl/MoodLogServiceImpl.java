package edu.icet.service.impl;

import edu.icet.entity.MoodLog;
import edu.icet.entity.User;
import edu.icet.repository.MoodLogRepository;
import edu.icet.repository.UserRepository;
import edu.icet.service.MoodLogService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MoodLogServiceImpl implements MoodLogService {

    private final MoodLogRepository moodLogRepository;
    private final UserRepository userRepository;

    @Override
    public void saveMood(Long userId, String overallMood) {

        User user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found"));

        MoodLog log = new MoodLog();
        log.setUser(user);
        log.setOverallMood(overallMood);
        log.setLoggedDate(LocalDate.now());

        moodLogRepository.save(log);
    }

    @Override
    public List<MoodLog> getUserMoodLogs(Long userId) {
        return moodLogRepository.findByUserUserId(userId);
    }
}
