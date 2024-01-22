package dev.lglomb.leistungsbewertung.api.repository;

import dev.lglomb.leistungsbewertung.api.entity.SchuelerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchuelerRepository extends JpaRepository<SchuelerEntity, Long> {
}
