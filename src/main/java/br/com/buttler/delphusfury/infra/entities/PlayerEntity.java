package br.com.buttler.delphusfury.infra.entities;

import br.com.buttler.delphusfury.infra.enums.Position;
import jakarta.persistence.*;

@Entity
@Table(name = "Players")
public class PlayerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @Enumerated(EnumType.STRING)
    private Position position;

    public PlayerEntity() {
    }

    public PlayerEntity(Long id, String name, Position position) {
        this.id = id;
        this.name = name;
        this.position = position;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
