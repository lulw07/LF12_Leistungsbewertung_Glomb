package dev.lglomb.leistungsbewertung.api.repository;

import dev.lglomb.leistungsbewertung.api.entity.LehrerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LehrerRepository extends JpaRepository<LehrerEntity, Long> {
}
