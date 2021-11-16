package com.simplon.formation.persistance.dao;

import java.util.List;

import com.simplon.formation.persistance.entities.LearnerDo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * Interface Repository for Learner
 */
@Repository
public interface ILearnerDao extends JpaRepository<LearnerDo, Long> {

    /**
     * To have the list of LearnerDo by title
     * 
     * @param title
     * @return List<LearnerDo>
     */
    @Query(value = "SELECT * FROM learner WHERE learner_name = ?1", nativeQuery = true)
    List<LearnerDo> findAllByNameContaining(String learnerName);
    
}
