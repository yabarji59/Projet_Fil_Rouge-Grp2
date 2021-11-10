package com.simplon.formation.business.services.interfaces;

import java.util.List;

import com.simplon.formation.presentation.model.ProgramDto;



public interface IProgramService {


    List<ProgramDto> getAllPrograms();
    List<ProgramDto> findProgramByTitle(String title);
    ProgramDto findProgramById(Long id);
    void createProgram(ProgramDto programDto);
    void updateProgram(Long id, ProgramDto postDto);
    void deleteProgram(Long id);
}
