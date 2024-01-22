package dev.lglomb.leistungsbewertung.api.entity;

import jakarta.persistence.*;

public class LehrerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long lehrerId;

    private String name;

    public LehrerEntity() {
    }

    public LehrerEntity(Long lehrerId, String name) {
        this.lehrerId = lehrerId;
        this.name = name;
    }

    public Long getLehrerId() {
        return lehrerId;
    }

    public void setLehrerId(Long lehrerId) {
        this.lehrerId = lehrerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
