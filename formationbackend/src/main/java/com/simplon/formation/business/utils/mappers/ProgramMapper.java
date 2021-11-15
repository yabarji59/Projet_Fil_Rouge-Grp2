package com.simplon.formation.business.utils.mappers;

import java.util.ArrayList;
import java.util.List;

import com.simplon.formation.persistance.entities.ProgramDo;
import com.simplon.formation.presentation.model.ProgramDto;

public class ProgramMapper {


      
    /**
     * map a programdo ---> ProgramDto
     * @param programDo
     * @return
     */
    public ProgramDto mapToProgramDto(ProgramDo programDo) {
        ProgramDto programDto = new ProgramDto();
        if (programDo == null) {
            return null;
        }
        programDto.setProgramId(programDo.getProgramId());
        programDto.setProgramTitle(programDo.getProgramTitle());
        programDto.setProgramDescription(programDo.getProgramDescription());
        
        return programDto;
    }

 
 /**map a programDto ---> programdo
  * 
  * @param programDto
  * @return
  */
    public ProgramDo mapToProgramDo(final ProgramDto programDto) {
        final ProgramDo programDo= new ProgramDo();
        if (programDto == null) {
            return null;
        }
        if(programDto.getProgramId()!= null) {

        programDo.setProgramId(programDto.getProgramId());}
        programDo.setProgramTitle(programDto.getProgramTitle());
        programDo.setProgramDescription(programDto.getProgramDescription());
        return programDo;
    }

    /**map a list of objets Do ---> list of objets Dto
     * @param listProgramDo
     * @return
     */
    public List<ProgramDto> mapToListProgramsDto(final List<ProgramDo> listProgramDo) {
       List<ProgramDto> listProgramsDto = new ArrayList<>();
        for (ProgramDo programDo : listProgramDo) {
            listProgramsDto.add(mapToProgramDto(programDo));
            System.out.println(programDo.getProgramTitle());
        }
        return listProgramsDto;
    }


}
