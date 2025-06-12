package com.miniLab.MiniLab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.miniLab.MiniLab.model.Responsable;

@Repository
public interface ResponsableRepository extends JpaRepository<Responsable, Long> {

}
