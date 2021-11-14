package com.simplon.formation.business.services.interfaces;

import java.util.List;

import com.simplon.formation.presentation.model.ProgramDto;
/**
 * 
 * IProgramServices interface for management business methods for programs

 */


public interface IProgramService {
/**
	 * return the list of all programs
	 * @return allPrograms
	 */

    List<ProgramDto> getAllPrograms();
    /**
	 * return the list of programs from a title
	 * 
	 * @param title
	 * @return List of programs from title
	 */
	 
    List<ProgramDto> findProgramByTitle(String title);
    /**
	 *to search for a program from its id
	 * 
	 * @param id
	 * @return programDto
	 */
    ProgramDto findProgramById(Long id);
    /**
	 * Allows you to create a new Program
	 * 
	 * @param programDto
	 * @return id
	 */
    void createProgram(ProgramDto programDto);
    /**
	 * update a program from its id
	 * 
	 * @param id
	 * @param programDto
	 * 
	 */
    void updateProgram(Long id, ProgramDto programDto);
    /**
	 *delete a program
	 * 
	 * @param id
	 */
    void deleteProgram(Long id);
}
