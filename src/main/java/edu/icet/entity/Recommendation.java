package edu.icet.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "recommendations")
@Getter
@Setter

public class Recommendation{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rec_id")
    private Long recId;

    private String moodType;
    private String category;

    @Column(columnDefinition = "TEXT")
    private String contentText;

    private String linkUrl;
}


