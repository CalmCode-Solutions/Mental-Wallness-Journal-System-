package edu.icet.service;

import edu.icet.dto.JournalRequestDTO;
import edu.icet.dto.JournalResponseDTO;

import java.util.List;

public interface JournalService {
    JournalResponseDTO saveJournal(JournalRequestDTO dto);
    List<JournalResponseDTO> getUserJournals(Long userId);
}
