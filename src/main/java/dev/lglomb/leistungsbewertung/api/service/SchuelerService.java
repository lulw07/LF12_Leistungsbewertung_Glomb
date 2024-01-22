package dev.lglomb.leistungsbewertung.api.service;

import dev.lglomb.leistungsbewertung.api.entity.SchuelerEntity;
import dev.lglomb.leistungsbewertung.api.repository.SchuelerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchuelerService {

    @Autowired
    private SchuelerRepository schuelerRepository;

    public List<SchuelerEntity> getAllSchueler() {
        return schuelerRepository.findAll();
    }

    public SchuelerEntity getSchuelerById(Long schuelerId) {
        return schuelerRepository.findById(schuelerId).orElse(null);
    }

    public SchuelerEntity saveSchueler(SchuelerEntity schueler) {
        return schuelerRepository.save(schueler);
    }

    public void deleteSchueler(Long schuelerId) {
        schuelerRepository.deleteById(schuelerId);
    }
}
