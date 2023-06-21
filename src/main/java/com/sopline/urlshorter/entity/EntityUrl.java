package com.sopline.urlshorter.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "url", schema= "public")
@AllArgsConstructor
@Getter
@Setter
public class EntityUrl {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String token;

    private String longUrl;

    private LocalDateTime createdAt;

    private LocalDateTime expiryAt;

}
