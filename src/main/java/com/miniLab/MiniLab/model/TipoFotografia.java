package com.miniLab.MiniLab.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="tipo_fotografia")
@NoArgsConstructor
public class TipoFotografia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String modalidad;
}
