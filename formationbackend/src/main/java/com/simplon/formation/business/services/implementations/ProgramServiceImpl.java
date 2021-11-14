package com.simplon.formation.business.services.implementations;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import com.simplon.formation.business.services.interfaces.IProgramService;
import com.simplon.formation.business.utils.mappers.ProgramMapper;
import com.simplon.formation.persistance.dao.IProgramDao;
import com.simplon.formation.persistance.entities.ProgramDo;
import com.simplon.formation.presentation.model.ProgramDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Service class of the program object implementing the IProgramService interface 
 */
@Service
public class ProgramServiceImpl  implements IProgramService{

    
    private IProgramDao programDao;

    private ProgramMapper mapper = new ProgramMapper();

    public ProgramServiceImpl(IProgramDao programDao) {
        
        this.programDao=programDao;
    }


    @Override
    public List<ProgramDto> getAllPrograms() {
        List<ProgramDto> allPrograms = new ArrayList<ProgramDto>();
		allPrograms = mapper.mapToListProgramsDto(programDao.findAll());
		return allPrograms;
    }

    @Override
    public List<ProgramDto> findProgramByTitle(String title) {
        List<ProgramDto> allPrograms = new ArrayList<ProgramDto>();
		allPrograms = mapper.mapToListProgramsDto(programDao.findAllByTitleContaining(title));
		return allPrograms;
    }

    @Override
    public ProgramDto findProgramById(Long id) {
        ProgramDto programDtoId = new ProgramDto();
        Optional<ProgramDo> programDo = programDao.findById(id);

        if(programDo.isPresent()){
            ProgramDo program = new ProgramDo();
            program = programDo.get();
            programDtoId = mapper.mapToProgramDto(program);
            return programDtoId;
        }
        throw new RuntimeException("that object does not exist");
    }

    @Override
    public void createProgram(ProgramDto programDto) {
        ProgramDo program = new ProgramDo();
        program = mapper.mapToProgramDo(programDto);
        programDao.save(program);
    }

  
   

    @Override
    public void updateProgram(Long id, ProgramDto programDto) {
        ProgramDo programDo = programDao.findById(id).get();
		programDo.setProgramTitle(programDto.getProgramTitle());
        programDo.setProgramDescription(programDto.getProgramDescription());
		programDao.save(programDo);
		 }

    @Override
    public void deleteProgram(Long id) {
      this.programDao.deleteById(id);
        
    }
    
}
