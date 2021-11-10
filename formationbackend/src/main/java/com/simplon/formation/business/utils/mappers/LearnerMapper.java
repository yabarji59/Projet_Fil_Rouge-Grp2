package com.simplon.formation.business.utils.mappers;

import com.simplon.formation.persistance.entities.LearnerDo;
import com.simplon.formation.presentation.model.LearnerDto;

public class LearnerMapper {
    
    public LearnerDto mapToLearnerDto(LearnerDo learnerDo) {
        LearnerDto learnerDto = new LearnerDto();
        if (learnerDo == null) {
            return null;
        }
        learnerDto.setLearnerId(learnerDo.getLearnerId());
        learnerDto.setLearnerName(learnerDo.getLearnerName());
        learnerDto.setLearnerFirstname(learnerDo.getLearnerFisrtname());
        // learnerDto.setSession(learnerDo.getSession());
        return learnerDto;
    }

    // mapToLearnerDo( )

    // mapToListLearnerDto( )

}
