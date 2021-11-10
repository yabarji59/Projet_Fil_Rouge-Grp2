package com.simplon.formation.presentation.controller;

import java.util.List;
import org.apache.commons.lang3.StringUtils;

import com.simplon.formation.business.services.interfaces.IFormerService;
import com.simplon.formation.presentation.model.FormerDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class FormerController {

    @Autowired
    IFormerService programService;
    
    public FormerController(IFormerService formerService){
        this.formerService = formerService;
    }

        @GetMapping({ "/formers" })
        public List<FormerDto> list(@RequestParam(required = false) String name) {
            if (StringUtils.isEmpty(name)) {
                return programService.getAllFormers();
            }
            return formerService.findFormerByName    }

    
}
