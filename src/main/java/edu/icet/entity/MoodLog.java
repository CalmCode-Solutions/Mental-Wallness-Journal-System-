package edu.icet.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "mood_logs")
@Getter
@Setter

public class MoodLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "log_id")
    private Long logId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private String overallMood;

    private LocalDate loggedDate;
}


