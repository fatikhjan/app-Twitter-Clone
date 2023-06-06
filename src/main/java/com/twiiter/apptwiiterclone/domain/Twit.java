package com.twiiter.apptwiiterclone.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
public class Twit implements BaseEntity {

    @Id
    private UUID id;

    private String userId;

    private String body;

    private LocalDateTime publishedTime;

    private Integer views;

    private Integer likes;

    private Integer AmountComments;

    @Column(nullable = false)
    private UUID parent_id;

    private String photo;

    private String video;


}
