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
	 * Permet de retourner la liste de tous les programmes
	 * 
	 * Postman link : GET api/programs
	 * 
	 * @return liste des programs
	 */

    @GetMapping({ "/programs" })
	public List<ProgramDto> list(@RequestParam(required = false) String title) {
		if (StringUtils.isEmpty(title)) {
			return programService.getAllPrograms();
		}
		return programService.findProgramByTitle(title);
	}
/**
	 * Permet de retrouver un program par son id
	 * 
	 * @param id
	 * @return programtDto
	 */
    @GetMapping({ "/programs/{id}" })
	public ProgramDto getById(@PathVariable Long id) {
		ProgramDto programDto = programService.findProgramById(id);
		return programDto;
	}
/**
	 * Permet de creer un nouveau program
	 * 
	 * @param post
	 */
	@PostMapping({ "/programs" })
	public void save(@RequestBody ProgramDto programDto) {
		this.programService.createProgram(programDto);

	}

    /**
	 * Permet de mettre à jour un Post
	 * 
	 * @param id
	 * @param postDto
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
