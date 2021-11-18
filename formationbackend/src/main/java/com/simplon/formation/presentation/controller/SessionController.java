package com.simplon.formation.presentation.controller;

import java.util.ArrayList;
import java.util.List;

import com.simplon.formation.business.services.interfaces.ILearnerService;
import com.simplon.formation.business.services.interfaces.ISessionService;
import com.simplon.formation.presentation.model.LearnerDto;
import com.simplon.formation.presentation.model.SessionDto;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
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
public class SessionController {
    
    @Autowired
    ISessionService sessionService;
    @Autowired
    ILearnerService learnerService;

/**
 * Postman link : GET api/programs
 * @param title
 * @return   list of  sessions
 */
    @GetMapping({ "/sessions" })
	public List<SessionDto> list(@RequestParam(required = false) String title) {
		if (StringUtils.isEmpty(title)) {
			return sessionService.getAllSessions();
		}
		return sessionService.findSessionByTitle(title);}



/**
 * 
 * @param id
 * @return sessionDto by id
 */
        @GetMapping({ "/sessions/{id}" })
        public SessionDto getById(@PathVariable Long id) {
            SessionDto sessionDto = sessionService.findSessionById(id);
            return sessionDto;
        }

        @GetMapping({ "/sessions/learners/{id}" })
        public List<LearnerDto> getLearners(@PathVariable Long id) {
            List<LearnerDto> listFinal= new ArrayList<>();
            List<LearnerDto> learners = learnerService.getAllLearners();
             for(LearnerDto item :learners) {
                 System.out.println(item.getLearnerSession().getSessionId());
                   if(item.getLearnerSession().getSessionId()==id) {
                    listFinal.add(item);
                   
               }
            } return listFinal;}




/**
 * create new session
 * @param sessionDto
 */
        @PostMapping({ "/sessions" })
        public void save(@RequestBody SessionDto sessionDto) {
            this.sessionService.createSession(sessionDto);
    
        }

/**
 * update session
 * @param id
 * @param sessionDto
 */
        @PutMapping("/sessions/{id}")
        public void update(@PathVariable Long id, @RequestBody SessionDto sessionDto) {
            SessionDto currentSessionDto = sessionService.findSessionById(id);
            if (currentSessionDto != null) {
                sessionService.updateSession(id, sessionDto);
            } else {
                sessionService.createSession(sessionDto);
            }
    
        }
/**
 * delete session
 * @param id
 */
        @DeleteMapping("/sessions/{id}")
        public void delete(@PathVariable Long id) {
            sessionService.deleteSession(id);
        }
}
