package com.simplon.formation.persistance.dao;

import java.util.List;

import com.simplon.formation.persistance.entities.ProgramDo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProgramDao extends JpaRepository<ProgramDo, Long> {
    List<ProgramDo> findAllByTitleContaining(String title);
}
