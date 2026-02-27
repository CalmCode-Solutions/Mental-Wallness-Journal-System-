package edu.icet.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


import java.time.LocalDateTime;

@Entity
@Table(name = "journals")
@Getter
@Setter
public class Journal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "journal_id")

    private Long journalId;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @Column(columnDefinition = "TEXT")
    private String content;
    private String sentiment;
    @Column(name = "sentiment_score")
    private Float sentimentScore;
    @Column(name = "created_at")
    private LocalDateTime createdAt = LocalDateTime.now();
}

