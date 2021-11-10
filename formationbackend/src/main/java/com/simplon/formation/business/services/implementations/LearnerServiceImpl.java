package com.simplon.formation.business.services.implementations;

import java.util.List;

import com.simplon.formation.business.services.interfaces.ILearnerService;
import com.simplon.formation.persistance.dao.ILearnerDao;
import com.simplon.formation.presentation.model.LearnerDto;

import org.springframework.beans.factory.annotation.Autowired;

public class LearnerServiceImpl  implements ILearnerService{

    @Autowired
    private ILearnerDao learnerDao;

    

    @Override
    public List<LearnerDto> getAllLearners() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<LearnerDto> findAllLearnersByName(String learnerName) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public LearnerDto findLearnerById(Long learnerId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void createLearner(LearnerDto learnerDto) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void updateLearner(Long learnerId, LearnerDto learnerDto) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteLearner(Long learnerId) {
        // TODO Auto-generated method stub
        
    }
    
    @Autowired


}
