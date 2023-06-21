package com.sopline.urlshorter.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "url", schema= "public")
@AllArgsConstructor
@Getter
@Setter
public class UrlShortenerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String token;

    private String longUrl;

    private LocalDateTime createdAt;

    private LocalDateTime expiryAt;

}
