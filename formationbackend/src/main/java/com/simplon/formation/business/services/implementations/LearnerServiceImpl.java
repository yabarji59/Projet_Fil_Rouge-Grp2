package com.simplon.formation.business.services.implementations;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.simplon.formation.business.services.interfaces.ILearnerService;
import com.simplon.formation.business.utils.mappers.LearnerMapper;
import com.simplon.formation.persistance.dao.ILearnerDao;
import com.simplon.formation.persistance.entities.LearnerDo;
import com.simplon.formation.presentation.model.LearnerDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LearnerServiceImpl implements ILearnerService{

    @Autowired
    private ILearnerDao learnerDao;

    private LearnerMapper learnerMapper = new LearnerMapper();

    @Override
    public List<LearnerDto> getAllLearners() {
        List<LearnerDto> allLearners = new ArrayList<LearnerDto>();
        List<LearnerDo> learnersFromDatabase = learnerDao.findAll();
        allLearners = learnerMapper.mapToListLearnersDto(learnersFromDatabase);
        return allLearners;
    }

    @Override
    public List<LearnerDto> findAllLearnersByName(String learnerName) {
        List<LearnerDto> listLearners = new ArrayList<LearnerDto>();
        listLearners = learnerMapper.mapToListLearnersDto(learnerDao.findAllByTitleContaining(learnerName));
        return listLearners;
    }

    @Override
    public LearnerDto findLearnerById(Long learnerId) {
        LearnerDto learnerDtoId = new LearnerDto();
        Optional<LearnerDo> learnerDo = learnerDao.findById(learnerId);

        if(learnerDo.isPresent()){
            LearnerDo learner = new LearnerDo();
            learner = learnerDo.get();
            learnerDtoId = learnerMapper.mapToLearnerDto(learner);
            return learnerDtoId;
        }
        throw new RuntimeException("that object does not exist");
    }

    @Override
    public void createLearner(LearnerDto learnerDto) {
        LearnerDo learnerDo = new LearnerDo();
        learnerDo = learnerMapper.mapToLearnerDo(learnerDto);
        learnerDao.save(learnerDo);  
    }

    @Override
    public void updateLearner(Long learnerId, LearnerDto learnerDto) {
        LearnerDo learnerDo = learnerDao.findById(learnerId).get();
		learnerDo.setLearnerName(learnerDto.getLearnerName());
        learnerDo.setLearnerFirstname(learnerDto.getLearnerFirstname());
        // learnerDo.setLearnerSession(sessionMapper.mapToSessionDo(learnerDto.getLearnerSession()));
		learnerDao.save(learnerDo);
        
    }

    @Override
    public void deleteLearner(Long learnerId) {
		learnerDao.deleteById(learnerId);
    }

}
