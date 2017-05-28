package com.klima.tomas.persistence.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table
public class Beer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
