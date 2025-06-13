package com.miniLab.MiniLab.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@Table(name="ediciones")
public class Ediciones {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String herramientas;
    private String detalles;

    @ManyToMany
    @JoinColumn(name="fotografia_id", referencedColumnName = "id")
    private Fotografia fotografia_id;
}
