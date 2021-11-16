package com.simplon.formation.presentation.controller;

import java.util.List;

import com.simplon.formation.business.services.interfaces.ILearnerService;
import com.simplon.formation.presentation.model.LearnerDto;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class LearnerController {
    
    @Autowired
    private ILearnerService learnerService;

    /**
     * Get the list of all learners
     * 
     * @param learnerName
     * @return list of all learners
     */
    @GetMapping({ "/learners" })
    public List<LearnerDto> getAllLearners () {
        return learnerService.getAllLearners();
    }

    /**
     * Get a list of learners by name
     * 
     * @param name
     * @return list of learners
     */
    @GetMapping({ "/learners?name={name}" })
	public List<LearnerDto> getLearnersByName (@RequestParam(value="name") String name) {
		List<LearnerDto> liste = learnerService.findAllLearnersByName(name);
		return liste;
	}

    /**
     * Find a learner by id
     * 
     * @param id
     * @return learnerDto
     */
    @GetMapping({ "/learners/{id}" })
	public LearnerDto getLearnerById(@PathVariable Long id) {
		LearnerDto learnerDto = learnerService.findLearnerById(id);
		return learnerDto;
	}

    /**
     * Create a new learner
     * 
     * @param learnerDto
     */
    @PostMapping({ "/learners" })
	public void createLearnerDto(@RequestBody LearnerDto learnerDto) {
		learnerService.createLearner(learnerDto);
	}

    /**
     * Update a learner or create a new one if the id is null
     * 
     * @param id
     * @param learnerDto
     */
    @PutMapping({ "/learners/{id} "})
	public void updateLearnerDto(@PathVariable Long id, @RequestBody LearnerDto learnerDto) {
		LearnerDto currentLearnerDto = learnerService.findLearnerById(id);
		if (currentLearnerDto != null) {
			learnerService.updateLearner(id, learnerDto);
		} else {
			learnerService.createLearner(learnerDto);
		}
	}

    /**
     * Delete a learner
     * 
     * @param id
     */
    @DeleteMapping({ "/learners/{id}" })
	public void deleteLearnerDto(@PathVariable(value = "id") Long id) {
		learnerService.deleteLearner(id);
	}

}
