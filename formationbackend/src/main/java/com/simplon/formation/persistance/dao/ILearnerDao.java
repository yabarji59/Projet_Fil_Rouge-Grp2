package com.simplon.formation.persistance.dao;

import java.util.List;

import com.simplon.formation.persistance.entities.LearnerDo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Interface Repository for Learner
 */
@Repository
public interface ILearnerDao extends JpaRepository<LearnerDo, String> {

    /**
     * To have the list of LearnerDo by title
     * 
     * @param title
     * @return List<LearnerDo>
     */
    List<LearnerDo> findAllByTitleContaining(String title);
    
}
