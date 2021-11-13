package com.simplon.formation.persistance.dao;

import java.util.List;

import com.simplon.formation.persistance.entities.SessionDo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface ISessionDao extends JpaRepository<SessionDo, Long>      {

    /**
     * retrieve the list of sessions by title
     * @param SessionTitle
     * @return
     */
    @Query(value = "SELECT * FROM SESSION WHERE SESSION_Title = ?1", nativeQuery = true)
    List<SessionDo> findAllByTitleContaining(String SessionTitle);
    
}
