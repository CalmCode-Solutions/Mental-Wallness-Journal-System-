package edu.icet.controllers;

import edu.icet.dto.JournalRequestDTO;
import edu.icet.dto.JournalResponseDTO;
import edu.icet.service.JournalService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


    @RestController
    @RequestMapping("/api/journals")
    @RequiredArgsConstructor
    public class JournalController {

        private final JournalService journalService;

        // 🔹 Save Journal
        @PostMapping
        public ResponseEntity<JournalResponseDTO> save(
                @RequestBody JournalRequestDTO dto) {

            return ResponseEntity.ok(journalService.saveJournal(dto));
        }

        // 🔹 Get Journals By User
        @GetMapping("/{userId}")
        public ResponseEntity<List<JournalResponseDTO>> getUserJournals(
                @PathVariable Long userId) {

            return ResponseEntity.ok(journalService.getUserJournals(userId));
        }
    }


