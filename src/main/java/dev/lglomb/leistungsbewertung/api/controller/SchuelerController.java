package dev.lglomb.leistungsbewertung.api.controller;

import dev.lglomb.leistungsbewertung.api.entity.SchuelerEntity;
import dev.lglomb.leistungsbewertung.api.service.SchuelerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/schueler")
public class SchuelerController {

    @Autowired
    private SchuelerService schuelerService;

    @GetMapping
    public List<SchuelerEntity> getAllSchueler() {
        return schuelerService.getAllSchueler();
    }

    @GetMapping("/{id}")
    public SchuelerEntity getSchuelerById(@PathVariable Long id) {
        return schuelerService.getSchuelerById(id);
    }

    @PostMapping
    public SchuelerEntity saveSchueler(@RequestBody SchuelerEntity schueler) {
        return schuelerService.saveSchueler(schueler);
    }

    @DeleteMapping("/{id}")
    public void deleteSchueler(@PathVariable Long id) {
        schuelerService.deleteSchueler(id);
    }
}
