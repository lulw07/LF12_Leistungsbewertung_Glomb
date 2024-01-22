package dev.lglomb.leistungsbewertung.api.service;

import dev.lglomb.leistungsbewertung.api.entity.LehrerEntity;
import dev.lglomb.leistungsbewertung.api.repository.LehrerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LehrerService {

    @Autowired
    private LehrerRepository lehrerRepository;

    public List<LehrerEntity> getAllLehrer() {
        return lehrerRepository.findAll();
    }

    public LehrerEntity getLehrerById(Long lehrerId) {
        return lehrerRepository.findById(lehrerId).orElse(null);
    }

    public LehrerEntity saveLehrer(LehrerEntity lehrer) {
        return lehrerRepository.save(lehrer);
    }

    public void deleteLehrer(Long lehrerId) {
        lehrerRepository.deleteById(lehrerId);
    }
}
