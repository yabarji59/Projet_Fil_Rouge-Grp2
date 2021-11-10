package com.simplon.formation.persistance.dao;

import java.util.List;

import com.simplon.formation.persistance.entities.FormerDo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFormerDao extends JpaRepository<FormerDo, Long>{
    
    
}
