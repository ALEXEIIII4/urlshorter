package com.sopline.urlshorter.controller;

import com.sopline.urlshorter.dto.UrlShortenerDto;
import com.sopline.urlshorter.service.UrlShortenerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/token")
public class UrlShortenerController {

    private final UrlShortenerService urlShortenerService;

    @PostMapping
    public ResponseEntity<String> createShortUrl(@RequestBody UrlShortenerDto urlShortenerDto) {
        return ResponseEntity.ok(urlShortenerService.createShortUrl(urlShortenerDto.getLongUrl()));
    }

    @GetMapping
    public ResponseEntity<String> redirectUrl(@RequestBody UrlShortenerDto urlShortenerDto) {
        return ResponseEntity.status(HttpStatus.PERMANENT_REDIRECT)
                .header("Location", urlShortenerDto.getToken())
                .build();
    }
}
