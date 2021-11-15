package com.simplon.formation.business.utils.mappers;

import java.util.ArrayList;
import java.util.List;

import com.simplon.formation.persistance.entities.LearnerDo;
import com.simplon.formation.presentation.model.LearnerDto;

public class LearnerMapper {

   
    
    /**
     * Map a learnerDo to a learnerDto
     * 
     * @param learnerDo
     * @return learnerDto
     */
    public LearnerDto mapToLearnerDto(LearnerDo learnerDo) {
        LearnerDto learnerDto = new LearnerDto();
        if (learnerDo == null) {
            return null;
        }
        learnerDto.setLearnerId(learnerDo.getLearnerId());
        learnerDto.setLearnerName(learnerDo.getLearnerName());
        learnerDto.setLearnerFirstname(learnerDo.getLearnerFirstname());
        // learnerDto.setLearnerSession(sessionMapper.mapToSessionDto(learnerDo.getLearnerSession()));
        return learnerDto;
    }

    /**
     * Map a learnerDto to a learnerDo
     * 
     * @param learnerDto
     * @return learnerDo
     */
    public LearnerDo mapToLearnerDo(final LearnerDto learnerDto) {
        final LearnerDo learnerDo= new LearnerDo();
        if (learnerDto == null) {
            return null;
        }
        learnerDo.setLearnerId(learnerDto.getLearnerId());
        learnerDo.setLearnerName(learnerDto.getLearnerName());
        learnerDo.setLearnerFirstname(learnerDto.getLearnerFirstname());
        // learnerDo.setLearnerSession(sessionMapper.mapToSessionDo(learnerDto.getLearnerSession()));
        return learnerDo;
    }

    /**
     * Map a list of learnerDo to a list of learnerDto
     * 
     * @param listLearnerDo
     * @return listLearnerDto
     */
    public List<LearnerDto> mapToListLearnersDto(final List<LearnerDo> listLearnerDo) {
        List<LearnerDto> listLearnerDto = new ArrayList<>();
        for (LearnerDo learnerDo : listLearnerDo) {
            listLearnerDto.add(mapToLearnerDto(learnerDo));
        }
        return listLearnerDto;
    }

}
