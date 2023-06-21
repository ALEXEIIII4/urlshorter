package com.sopline.urlshorter.service;

import com.sopline.urlshorter.repository.UrlShortenerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
@AllArgsConstructor
public class UrlShortenerService {

    private final UrlShortenerRepository repositoryUrl;

    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static final int BASE = ALPHABET.length();
    // длина короткого URL-адреса
    private static final int LENGTH = 7;

    /**
     * Метод для обрезки домена из URL
     */
    static public String cutHost(String shouldBeShort) {
        String host = null;
        int count = 0;
        for (int i = 0; i < shouldBeShort.length(); i++) {
            if (shouldBeShort.charAt(i) == '/')
                count++;
            if (count == 3) {
                host = shouldBeShort.substring(0, i + 1);
                break;
            }
        }
        return host;
    }

    /**
     * Метод для форматирование короткого URL
     */
    public String makeShortUrl(String longUrl) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        String domain = cutHost(longUrl);
        for (int i = 0; i < LENGTH; i++) {
            int index = random.nextInt(BASE);
            sb.append(ALPHABET.charAt(index));
        }
        return domain + sb.toString();
    }

}
