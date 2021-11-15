package com.simplon.formation.business.utils.mappers;

import java.util.ArrayList;
import java.util.List;

import com.simplon.formation.persistance.entities.FormerDo;
import com.simplon.formation.presentation.model.FormerDto;


public class FormerMapper {

    
    /** 
     * @param formerDo
     * @return FormerDto
     */
    public FormerDto mapToFormerDto(FormerDo formerDo) {
        FormerDto formerDto = new FormerDto();
        if (formerDo == null) {
            return null;
        }
        if(formerDo.getFormerId()!= null) {
        formerDto.setFormerId(formerDo.getFormerId());}
        formerDto.setFormerName(formerDo.getFormerName());
        formerDto.setFormerLastname(formerDo.getFormerLastname());
        
        return formerDto;
    }


    
    /** 
     * @param formerDto
     * @return FormerDo
     */
    public FormerDo mapToFormerDo(final FormerDto formerDto) {
        final FormerDo formerDo= new FormerDo();
        formerDo.setFormerId(formerDto.getFormerId());
        formerDo.setFormerName(formerDto.getFormerName());
        formerDo.setFormerLastname(formerDto.getFormerLastname());
        return formerDo;
    }
    
    /** 
     * @param listFormerDo
     * @return List<FormerDto>
     */
    public List<FormerDto> mapToListFormersDto(final List<FormerDo> listFormerDo) {
       List<FormerDto> listFormersDto = new ArrayList<>();
        for (FormerDo formerDo : listFormerDo) {
            listFormersDto.add(mapToFormerDto(formerDo));
            System.out.println(formerDo.getFormerName());
        }
        return listFormersDto;
    }


}

    

