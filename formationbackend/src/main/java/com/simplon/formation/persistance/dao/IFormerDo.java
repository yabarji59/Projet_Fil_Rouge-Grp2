package com.simplon.formation.persistance.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface IFormerDo extends JpaRepository<FormerDo, Long>{
    
    FormerDo FindById (Long id);
}
