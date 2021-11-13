package com.simplon.formation.business.utils.mappers;

import java.util.ArrayList;
import java.util.List;
import com.simplon.formation.persistance.entities.SessionDo;
import com.simplon.formation.presentation.model.SessionDto;



public class SessionMapper {
    
    private ProgramMapper programmapper = new ProgramMapper();

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
      //  sessionDto.FormerSession(sessionDo.getSessionFormer());
      //en attandant les mapper de former et learner
      
        sessionDto.setProgramSession(programmapper.mapToProgramDto(sessionDo.getSessionProgram()));
        
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
        sessionDo.setSessionId(sessionDto.getSessionId());
        sessionDo.setSessionTitle(sessionDto.getSessionTitle());
        sessionDo.setSessionProgram(programmapper.mapToProgramDo(sessionDto.getProgramSession()));
        //en attendant mapper lea,rner et former
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
