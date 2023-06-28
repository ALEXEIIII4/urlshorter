package com.sopline.urlshorter.converter;

import com.sopline.urlshorter.dto.UrlShortenerDto;
import com.sopline.urlshorter.entity.UrlShortenerEntity;
import org.springframework.stereotype.Component;

@Component
public class UrlShortenerMapper {

    public UrlShortenerEntity mapEntity(UrlShortenerDto dto) {
        UrlShortenerEntity urlShortenerEntity = new UrlShortenerEntity();
        urlShortenerEntity.setToken(dto.getToken());
        urlShortenerEntity.setLongUrl(dto.getLongUrl());
        return urlShortenerEntity;
    }

    public UrlShortenerDto mapDto(UrlShortenerEntity entity) {
        UrlShortenerDto urlShortenerDto = new UrlShortenerDto();
        urlShortenerDto.setToken(entity.getToken());
        urlShortenerDto.setLongUrl(entity.getLongUrl());
        return urlShortenerDto;
    }

}