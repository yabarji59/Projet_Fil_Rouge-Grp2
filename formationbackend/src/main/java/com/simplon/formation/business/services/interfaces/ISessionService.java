package com.simplon.formation.business.services.interfaces;

import java.util.List;

import com.simplon.formation.presentation.model.LearnerDto;
import com.simplon.formation.presentation.model.SessionDto;


/**
 * 
 * ISessionService interface for management business methods for Sessions

 */

public interface ISessionService {
    
/**
 * 
 * @return  allSessions
 */
    List<SessionDto> getAllSessions();

/**
 * 
 * @param title
 * @return the list of sessions from a title
 */
List<SessionDto> findSessionByTitle(String title);
/**
 * 
 * @param id
 * @return session from its id
 */
SessionDto findSessionById(Long id);
/**
 * create a new Session
 * @param sessionDto
 */
void createSession(SessionDto sessionDto);

/**
 *  update a session from its id
 * @param id
 * @param sessionDto
 */
void updateSession(Long id, SessionDto sessionDto);
/**
 * delete a session
 * @param id
 */
void deleteSession(Long id);

/**
 * assign program to session
 * @param sessionId
 * @param programId
 */
public void assignProgramtoSession( Long programId,Long sessionId);

/**assign former to session
 * 
 * @param formerId
 * @param sessionId
 */
public void assignFormertoSession( Long formerId,Long sessionId);

List<LearnerDto> findLearnersBySession(Long id);

}
