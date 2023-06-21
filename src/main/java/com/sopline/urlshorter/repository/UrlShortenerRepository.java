package com.sopline.urlshorter.repository;

import com.sopline.urlshorter.entity.UrlShortenerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UrlShortenerRepository extends JpaRepository<UrlShortenerEntity, String> {
}
