package com.simplon.formation.business.services.implementations;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.simplon.formation.business.services.interfaces.ISessionService;
import com.simplon.formation.business.utils.mappers.FormerMapper;
import com.simplon.formation.business.utils.mappers.ProgramMapper;
import com.simplon.formation.business.utils.mappers.SessionMapper;
import com.simplon.formation.persistance.dao.IFormerDao;
import com.simplon.formation.persistance.dao.ILearnerDao;
import com.simplon.formation.persistance.dao.IProgramDao;
import com.simplon.formation.persistance.dao.ISessionDao;
import com.simplon.formation.persistance.entities.*;
import com.simplon.formation.presentation.model.SessionDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SessionServiceImpl implements ISessionService

 { 
    @Autowired
    private ISessionDao sessionDao;
    @Autowired
    private IProgramDao programDao;
    @Autowired
    private IFormerDao formerDao;
    @Autowired
    private ILearnerDao learnerDao;

    private SessionMapper sessionMapper = new SessionMapper();
    private ProgramMapper programMapper = new ProgramMapper();
    private FormerMapper formerMapper = new FormerMapper();
    
    private static final Logger LOGGER = LoggerFactory.getLogger(SessionServiceImpl.class);

    @Override
    public List<SessionDto> getAllSessions() {
        LOGGER.info(" session SERVICE getall methode");
        List<SessionDto> allSessions = new ArrayList<SessionDto>();
		allSessions = sessionMapper.mapToListSessionsDto(sessionDao.findAll());
		return allSessions;
    }
    

    @Override
    public List<SessionDto> findSessionByTitle(String title) {
        LOGGER.info("session SERVICE getbytitle methode");
        List<SessionDto> allSessions = new ArrayList<SessionDto>();
		allSessions = sessionMapper.mapToListSessionsDto(sessionDao.findAllByTitleContaining(title));
		return allSessions;
    }

    @Override
    public SessionDto findSessionById(Long id) {
        LOGGER.info("session SERVICE findSessionById methode");
        SessionDto sessionDtoId = new SessionDto();
        Optional<SessionDo> sessionDo = sessionDao.findById(id);

        if(sessionDo.isPresent()){
            SessionDo session = new SessionDo();
            session = sessionDo.get();
            sessionDtoId = sessionMapper.mapToSessionDto(session);
            return sessionDtoId;
        }
        throw new RuntimeException("that object does not exist");
    }

    @Override
    public void createSession(SessionDto sessionDto) {
       
        if (sessionDto != null ) {
            LOGGER.info("session SERVICE : createsession methode session not null");
        SessionDo session = new SessionDo();
        session = sessionMapper.mapToSessionDo(sessionDto);
        sessionDao.save(session);
        } else {
            LOGGER.info("session SERVICE : createsession methode session null");
        }
    }

    @Override
    public void updateSession(Long id, SessionDto sessionDto) {
        if (sessionDto != null ) {
            LOGGER.info("session SERVICE : updateSession methode session not null");
        SessionDo sessionDo = sessionDao.findById(id).get();
		sessionDo.setSessionTitle(sessionDto.getSessionTitle());
        sessionDo.setSessionProgram(programMapper.mapToProgramDo(sessionDto.getProgramSession()));
       // sessionDo.setLearners(learners); en attendant learner 
       sessionDo.setSessionFormer(formerMapper.mapToFormerDo(sessionDto.getFormerSession()));
		sessionDao.save(sessionDo);
    } else {
        LOGGER.info("session SERVICE : updateSession methode session null");
    }
		 
    }

    @Override
    public void deleteSession(Long id) {
        this.sessionDao.deleteById(id);
        
    }


    @Override
    public void assignProgramtoSession(Long programId, Long sessionId) {
        LOGGER.info("session SERVICE :assignProgramtoSession");

        Optional<SessionDo> session = sessionDao.findById(sessionId);
        if (session.isPresent()) {
            Optional<ProgramDo> program = programDao.findById(programId);
            if (program.isPresent()) {
                SessionDo session1 = session.get();
                ProgramDo program1 = program.get();
                program1.setSession(null);
                session1.setSessionProgram(program1);
                sessionDao.save(session1);
               
            }
        }}


    @Override
    public void assignFormertoSession(Long formerId, Long sessionId) {
        LOGGER.info("session SERVICE :assignFormertoSession");

        Optional<SessionDo> session = sessionDao.findById(sessionId);
        if (session.isPresent()) {
            Optional<FormerDo> former = formerDao.findById(formerId);
            if (former.isPresent()) {
                SessionDo session1 = session.get();
                FormerDo former1 = former.get();
                former1.setSession(null);
                session1.setSessionFormer(former1);
                
                sessionDao.save(session1);
              
            }
            
        }}


   
    }