package dev.lglomb.leistungsbewertung.api.entity;

import jakarta.persistence.*;

@Entity
public class SchuelerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long schuelerId;

    private String name;

    private int spielgeld;

    public SchuelerEntity() {
    }

    public SchuelerEntity(Long schuelerId, String name, int spielgeld) {
        this.schuelerId = schuelerId;
        this.name = name;
        this.spielgeld = spielgeld;
    }

    public Long getSchuelerId() {
        return schuelerId;
    }

    public void setSchuelerId(Long schuelerId) {
        this.schuelerId = schuelerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpielgeld() {
        return spielgeld;
    }

    public void setSpielgeld(int spielgeld) {
        this.spielgeld = spielgeld;
    }
}
