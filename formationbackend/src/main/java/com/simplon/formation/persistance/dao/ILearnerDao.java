package com.simplon.formation.persistance.dao;

import com.simplon.formation.persistance.entities.LearnerDo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ILearnerDao extends JpaRepository<LearnerDo, Long>{
    
}
