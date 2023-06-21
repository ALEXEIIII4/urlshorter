package com.sopline.urlshorter.controller;

import com.sopline.urlshorter.entity.UrlShortenerEntity;
import com.sopline.urlshorter.service.UrlShortenerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class UrlShorneterController {

    private final UrlShortenerService serviceEncode;

    @PostMapping("/longToken")
    public ResponseEntity<String> createShortUrl(@RequestBody UrlShortenerEntity urlShortenerEntity){
        return ResponseEntity.ok(serviceEncode.makeShortUrl(urlShortenerEntity.getLongUrl()));
    }

}
