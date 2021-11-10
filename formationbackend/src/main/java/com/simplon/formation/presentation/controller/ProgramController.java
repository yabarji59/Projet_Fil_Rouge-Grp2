package com.simplon.formation.presentation.controller;

import java.util.List;

import com.simplon.formation.business.services.interfaces.IProgramService;
import com.simplon.formation.presentation.model.ProgramDto;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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
public class ProgramController {
    
    @Autowired
    IProgramService programService;
    public ProgramController(IProgramService programService){
        this.programService=programService;
    }


    /**
	 * 
       Allows you to return the list of all programs
	 * 
	 * Postman link : GET api/programs
	 * 
	 * @return list of  programs
	 */

    @GetMapping({ "/programs" })
	public List<ProgramDto> list(@RequestParam(required = false) String title) {
		if (StringUtils.isEmpty(title)) {
			return programService.getAllPrograms();
		}
		return programService.findProgramByTitle(title);
	}
/**
	 * Allows you to find a program by its id
	 * 
	 * @param id
	 * @return programDto
	 */
    @GetMapping({ "/programs/{id}" })
	public ProgramDto getById(@PathVariable Long id) {
		ProgramDto programDto = programService.findProgramById(id);
		return programDto;
	}
/**
	 * Allows you to create a new program
	 * 
	 * @param programDto
	 */
	@PostMapping({ "/programs" })
	public void save(@RequestBody ProgramDto programDto) {
		this.programService.createProgram(programDto);

	}

    /**
	 * Allows you to update a Program
	 * 
	 * @param id
	 * @param programtDto
	 */
	@PutMapping("/programs/{id}")
	public void update(@PathVariable Long id, @RequestBody ProgramDto programDto) {
		ProgramDto currentProgramDto = programService.findProgramById(id);
		if (currentProgramDto != null) {
			programService.updateProgram(id, programDto);
		} else {
			programService.createProgram(programDto);
		}

	}
}
