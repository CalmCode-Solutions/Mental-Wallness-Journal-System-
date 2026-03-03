package edu.icet.service.impl;

import edu.icet.dto.JournalRequestDTO;
import edu.icet.dto.JournalResponseDTO;
import edu.icet.entity.Journal;
import edu.icet.entity.User;
import edu.icet.repository.JournalRepository;
import edu.icet.repository.UserRepository;
import edu.icet.service.JournalService;
import lombok.RequiredArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class JournalServiceImpl implements JournalService {

    private final JournalRepository journalRepository;
    private final UserRepository userRepository;
    private final RestTemplate restTemplate;
    private final Environment environment;

    @Override
    public JournalResponseDTO saveJournal(JournalRequestDTO dto) {

        User user = userRepository.findById(dto.getUserId())
                .orElseThrow(() -> new RuntimeException("User not found"));

        String pythonUrl = environment.getProperty("python.api.url");

        Map<String, String> request = new HashMap<>();
        request.put("text", dto.getContent());

        Map response = restTemplate.postForObject(pythonUrl, request, Map.class);

        String sentiment = response.get("mood").toString();
        Float score = Float.valueOf(response.get("score").toString());

        Journal journal = new Journal();
        journal.setUser(user);
        journal.setContent(dto.getContent());
        journal.setSentiment(sentiment);
        journal.setSentimentScore(score);

        journalRepository.save(journal);

        return JournalResponseDTO.builder()
                .journalId(journal.getJournalId())
                .content(journal.getContent())
                .sentiment(sentiment)
                .sentimentScore(score)
                .build();
    }

    @Override
    public List<JournalResponseDTO> getUserJournals(Long userId) {
        return journalRepository.findByUserUserId(userId)
                .stream()
                .map(j -> JournalResponseDTO.builder()
                        .journalId(j.getJournalId())
                        .content(j.getContent())
                        .sentiment(j.getSentiment())
                        .sentimentScore(j.getSentimentScore())
                        .build())
                .toList();
    }
}
