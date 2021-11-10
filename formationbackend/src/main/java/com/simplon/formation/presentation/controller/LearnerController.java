package com.simplon.formation.presentation.controller;

import java.util.List;

import com.simplon.formation.business.services.interfaces.ILearnerService;
import com.simplon.formation.presentation.model.LearnerDto;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class LearnerController {
    
    @Autowired
    private ILearnerService learnerService;

    // @GetMapping({"/learners"})
    // public List<LearnerDto> getAllLearners (@RequestParam(required = false) String learnerName) {
    //     if (StringUtils.isEmpty(learnerName)) {
    //         // return learnerServiceImpl.getAllLearners();
    //     }
    // }

}
