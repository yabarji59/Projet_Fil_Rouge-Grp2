package com.simplon.formation.persistance.dao;

import java.util.List;

import java.util.Optional;


import com.simplon.formation.persistance.entities.FormerDo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFormerDao extends JpaRepository<FormerDo, Long>{
    List<FormerDo> findAllByNameContaining(String name);
    void deleteByName(String name);

    Optional<FormerDo> findByName(String name);
     
    

}
    

