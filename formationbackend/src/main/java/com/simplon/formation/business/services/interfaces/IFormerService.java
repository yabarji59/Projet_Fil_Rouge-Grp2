package com.simplon.formation.business.services.interfaces;

import java.util.List;
import com.simplon.formation.presentation.model.FormerDto;

public interface IFormerService {
    
    List<FormerDto> getAllFormers();

    FormerDto findFormerById(Long formerId);

   FormerDto findFormerByName(String formerName);

    void createFormer(FormerDto formerDto);

    void updateFormer(String formerName, FormerDto formerDto);

    void deleteFormer(String formerName);
}


