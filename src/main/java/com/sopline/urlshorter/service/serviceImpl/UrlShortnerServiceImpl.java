package com.sopline.urlshorter.service.serviceImpl;

public interface UrlShortnerServiceImpl{
    String createShortUrl(String url);
    String validation(String token);
}
