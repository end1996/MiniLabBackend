package com.miniLab.MiniLab.repository;

import com.miniLab.MiniLab.model.OrdenProduccion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdenProduccionRepository extends JpaRepository<OrdenProduccion, Long> {
}
