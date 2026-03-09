package edu.icet.service;

import edu.icet.entity.MoodLog;

import java.util.List;

public interface MoodLogService {

    void saveMood(Long userId, String overallMood);

    List<MoodLog> getUserMoodLogs(Long userId);
}
