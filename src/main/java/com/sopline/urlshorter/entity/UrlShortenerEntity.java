package com.sopline.urlshorter.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "url", schema = "public")
@NoArgsConstructor
@Getter
@Setter
public class UrlShortenerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String token;

    private String longUrl;
}
