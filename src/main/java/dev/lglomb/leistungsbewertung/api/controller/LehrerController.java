package dev.lglomb.leistungsbewertung.api.controller;

import dev.lglomb.leistungsbewertung.api.entity.LehrerEntity;
import dev.lglomb.leistungsbewertung.api.service.LehrerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lehrer")
public class LehrerController {

    @Autowired
    private LehrerService lehrerService;

    @GetMapping
    public List<LehrerEntity> getAllLehrer() {
        return lehrerService.getAllLehrer();
    }

    @GetMapping("/{id}")
    public LehrerEntity getLehrerById(@PathVariable Long id) {
        return lehrerService.getLehrerById(id);
    }

    @PostMapping
    public LehrerEntity saveLehrer(@RequestBody LehrerEntity lehrer) {
        return lehrerService.saveLehrer(lehrer);
    }

    @DeleteMapping("/{id}")
    public void deleteLehrer(@PathVariable Long id) {
        lehrerService.deleteLehrer(id);
    }
}
