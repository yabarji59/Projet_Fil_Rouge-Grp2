package com.simplon.formation.business.services.implementations;

import com.simplon.formation.business.services.interfaces.IFormerService;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import com.simplon.formation.business.services.interfaces.IFormerService;
import com.simplon.formation.business.utils.mappers.FormerMapper;
import com.simplon.formation.persistance.dao.IFormerDao;
import com.simplon.formation.persistance.entities.FormerDo;
import com.simplon.formation.presentation.model.FormerDto;


import org.springframework.stereotype.Service;
@Service
public class FormerServiceImpl  implements IFormerService{

    private IFormerDao formerDao;

    private FormerMapper mapper = new FormerMapper();

    public FormerServiceImpl(IFormerDao formerDao,FormerMapper mapper ) {
         this.formerDao=formerDao;
         this.mapper=mapper;
    }

    @Override
    public List<FormerDto> getAllFormers() {
        List<FormerDto> allFormers = new ArrayList<FormerDto>();
		allFormers = mapper.mapToListFormersDto(formerDao.findAll());
		return allFormers;
    }


     @Override
    public FormerDto findFormerByName(String formerName) {
        FormerDto formerDtoId = new FormerDto();
        Optional<FormerDo> formerDo = formerDao.findFormerByName(formerName);

        if(formerDo.isPresent()){
            FormerDo former = new FormerDo();
            former = formerDo.get();
            formerDtoId = mapper.mapToFormerDto(former);
            return formerDtoId;
        }
        throw new RuntimeException("that object does not exist");
    
    }

    @Override
    public void createFormer(FormerDto formerDto) {
        FormerDo former = new FormerDo();
        former = mapper.mapToFormerDo(formerDto);
        formerDao.save(former);
        
    }

    @Override
    public void updateFormer(Long id, FormerDto formerDto) {
        
    }

    @Override
    public void deleteFormer(String formerName) {
        this.formerDao.deleteById(id);
        
    }

    
}
