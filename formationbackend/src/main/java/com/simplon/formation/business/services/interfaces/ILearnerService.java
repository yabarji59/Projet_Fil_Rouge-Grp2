package com.simplon.formation.business.services.interfaces;

import java.util.List;

import com.simplon.formation.presentation.model.LearnerDto;

public interface ILearnerService {
    
    /**
     * Have a list of all learners
     * 
     * @return List<LearnerDto>
     */
    List<LearnerDto> getAllLearners();

    /**
     * Find a list of learners by name
     * 
     * @param learnerName
     * @return List<LearnerDto>
     */
    List<LearnerDto> findAllLearnersByName(String learnerName);

    /**
     * Find a list of learners by id
     * 
     * @param learnerId
     * @return LearnerDto
     */
    LearnerDto findLearnerById(Long learnerId);

    /**
     * Create a new learner
     * 
     * @param learnerDto
     */
    void createLearner(LearnerDto learnerDto);

    /**
     * Update a learner
     * 
     * @param learnerId
     * @param learnerDto
     */
    void updateLearner(Long learnerId, LearnerDto learnerDto);

    /**
     * Delete a learner
     * 
     * @param learnerId
     */
    void deleteLearner(Long learnerId);
    /**
 * assign learner to session
 * @param learnerId
 * @param sessionId
 */

    void assignLearnertoSession(Long learnerId, Long sessionId);

}
