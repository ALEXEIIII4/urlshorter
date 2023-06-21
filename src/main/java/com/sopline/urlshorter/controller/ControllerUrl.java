package com.sopline.urlshorter.controller;

import com.sopline.urlshorter.entity.EntityUrl;
import com.sopline.urlshorter.service.ServiceUrl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class ControllerUrl {

    private final ServiceUrl serviceEncode;

    @PostMapping("/longToken")
    public ResponseEntity<String> createShortUrl(@RequestBody EntityUrl entityUrl){
        return ResponseEntity.ok(serviceEncode.makeShortUrl(entityUrl.getLongUrl()));
    }

}
