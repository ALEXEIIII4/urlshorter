package com.sopline.urlshorter.repository;

import com.sopline.urlshorter.entity.UrlShortenerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;
@Repository
public interface UrlShortenerRepository extends JpaRepository<UrlShortenerEntity, Long> {
    Optional<UrlShortenerEntity> findById(Long id);
    Optional<UrlShortenerEntity> findByToken(String url);
}
