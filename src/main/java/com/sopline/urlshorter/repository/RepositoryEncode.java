package com.sopline.urlshorter.repository;

import com.sopline.urlshorter.entity.EntityUrl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryEncode extends JpaRepository<EntityUrl, Long> {

    EntityUrl findById(EntityUrl entityUrl);
}
