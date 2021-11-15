package com.simplon.formation.persistance.dao;

import java.util.List;

import java.util.Optional;


import com.simplon.formation.persistance.entities.FormerDo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IFormerDao extends JpaRepository<FormerDo, Long>{
    
    @Query(value = "SELECT * FROM FORMER WHERE FORMER_Name = ?1", nativeQuery = true)
    List<FormerDo> findAllByNameContaining(String formerName);


    @Query(value = "SELECT * FROM FORMER WHERE FORMER_Name = ?1", nativeQuery = true)
    Optional<FormerDo> findByName(String formerName);
     
    

}
    

