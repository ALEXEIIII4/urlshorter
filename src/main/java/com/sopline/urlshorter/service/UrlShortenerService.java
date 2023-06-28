package com.sopline.urlshorter.service;

import com.sopline.urlshorter.converter.UrlShortenerMapper;
import com.sopline.urlshorter.dto.UrlShortenerDto;
import com.sopline.urlshorter.entity.UrlShortenerEntity;
import com.sopline.urlshorter.repository.UrlShortenerRepository;
import com.sopline.urlshorter.service.serviceImpl.UrlShortnerServiceImpl;
import lombok.AllArgsConstructor;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class UrlShortenerService implements UrlShortnerServiceImpl {

    private final UrlShortenerRepository urlShortenerRepository;
    private final UrlShortenerMapper urlShortenerMapper;

    @Override
    public String createShortUrl(String url) {
        String token = RandomStringUtils.randomAlphabetic(7);
        UrlShortenerDto dto = new UrlShortenerDto();
        UrlShortenerEntity entity = urlShortenerMapper.mapEntity(dto);

        dto.setLongUrl(url);
        entity.setToken(token);
        entity.setLongUrl(url);

        urlShortenerRepository.save(entity);
        return token;
    }

    @Override
    public String validation(String longUrl) {
        String token = String.valueOf(urlShortenerRepository.findByToken(longUrl));
        return token;
    }
}
