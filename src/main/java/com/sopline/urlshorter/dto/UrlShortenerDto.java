package com.sopline.urlshorter.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UrlShortenerDto {
    private Long id;

    private String token;

    private String longUrl;

}