package com.simplon.formation.business.utils.mappers;

import java.util.ArrayList;
import java.util.List;
import com.simplon.formation.persistance.entities.SessionDo;
import com.simplon.formation.presentation.model.SessionDto;



public class SessionMapper {
    
    private ProgramMapper programMapper = new ProgramMapper();
    private LearnerMapper learnerMapper = new LearnerMapper();
    private FormerMapper formerMapper = new FormerMapper();

/**
 * map a sessiondo ---> sessionDto
 * @param sessionDo
 * @return
 */
    public SessionDto mapToSessionDto(SessionDo sessionDo) {
        SessionDto sessionDto = new SessionDto();
        if (sessionDo == null) {
            return null;
        }
        sessionDto.setSessionId(sessionDo.getSessionId());
        sessionDto.setSessionTitle(sessionDo.getSessionTitle());
      sessionDto.setFormerSession(formerMapper.mapToFormerDto(sessionDo.getSessionFormer()));
        sessionDto.setProgramSession(programMapper.mapToProgramDto(sessionDo.getSessionProgram()));
       // sessionDto.setLearnersSession(learnerMapper.mapToListLearnersDto(sessionDo.getLearners()));
        return sessionDto;
    }

/**
 * map a sessionDto ---> sessiondo
 * @param sessionDto
 * @return
 */
    public SessionDo mapToSessionDo(final SessionDto sessionDto) {
        final SessionDo sessionDo= new SessionDo();
        if (sessionDto == null) {
            return null;
        }
        if(sessionDto.getSessionId()!= null) {
        sessionDo.setSessionId(sessionDto.getSessionId());}
        sessionDo.setSessionTitle(sessionDto.getSessionTitle());
        sessionDo.setSessionProgram(programMapper.mapToProgramDo(sessionDto.getProgramSession()));
        sessionDo.setSessionFormer(formerMapper.mapToFormerDo(sessionDto.getFormerSession()));
      //sessionDo.setLearners(learnerMapper.mapToListLearnersDto(mapToListSessionsDto(sessionDto.getLearnersSession())));
        return sessionDo;
    }
    
/**
 * map a list of  session objets Do ---> list of session objets Dto
 * @param listSessionDo
 * @return
 */
    public List<SessionDto> mapToListSessionsDto(final List<SessionDo> listSessionDo) {
        List<SessionDto> listsessionsDto = new ArrayList<>();
         for (SessionDo sessionDo : listSessionDo) {
            listsessionsDto.add(mapToSessionDto(sessionDo));
             System.out.println(sessionDo.getSessionTitle());
         }
         return listsessionsDto;
     }
}
