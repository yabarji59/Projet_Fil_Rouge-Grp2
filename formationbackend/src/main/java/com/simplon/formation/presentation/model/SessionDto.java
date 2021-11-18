package com.simplon.formation.presentation.model;

import java.util.List;
import java.util.Objects;
/**
 * classe object sessionDTO
 */


public class SessionDto {
    
    private Long SessionId;
    private String SessionTitle;
    private ProgramDto ProgramSession;
    private FormerDto FormerSession;
   


    public SessionDto() {
    }

    public SessionDto(Long SessionId, String SessionTitle, ProgramDto ProgramSession, FormerDto FormerSession, List<LearnerDto> LearnersSession) {
        this.SessionId = SessionId;
        this.SessionTitle = SessionTitle;
        this.ProgramSession = ProgramSession;
        this.FormerSession = FormerSession;
        
    }

    public Long getSessionId() {
        return this.SessionId;
    }

    public void setSessionId(Long SessionId) {
        this.SessionId = SessionId;
    }

    public String getSessionTitle() {
        return this.SessionTitle;
    }

    public void setSessionTitle(String SessionTitle) {
        this.SessionTitle = SessionTitle;
    }

    public ProgramDto getProgramSession() {
        return this.ProgramSession;
    }

    public void setProgramSession(ProgramDto ProgramSession) {
        this.ProgramSession = ProgramSession;
    }

    public FormerDto getFormerSession() {
        return this.FormerSession;
    }

    public void setFormerSession(FormerDto FormerSession) {
        this.FormerSession = FormerSession;
    }

   

    public SessionDto SessionId(Long SessionId) {
        setSessionId(SessionId);
        return this;
    }

    public SessionDto SessionTitle(String SessionTitle) {
        setSessionTitle(SessionTitle);
        return this;
    }

    public SessionDto ProgramSession(ProgramDto ProgramSession) {
        setProgramSession(ProgramSession);
        return this;
    }

    public SessionDto FormerSession(FormerDto FormerSession) {
        setFormerSession(FormerSession);
        return this;
    }

    public SessionDto(Long SessionId, String SessionTitle, ProgramDto ProgramSession, FormerDto FormerSession) {
        this.SessionId = SessionId;
        this.SessionTitle = SessionTitle;
        this.ProgramSession = ProgramSession;
        this.FormerSession = FormerSession;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof SessionDto)) {
            return false;
        }
        SessionDto sessionDto = (SessionDto) o;
        return Objects.equals(SessionId, sessionDto.SessionId) && Objects.equals(SessionTitle, sessionDto.SessionTitle) && Objects.equals(ProgramSession, sessionDto.ProgramSession) && Objects.equals(FormerSession, sessionDto.FormerSession);
    }

    @Override
    public int hashCode() {
        return Objects.hash(SessionId, SessionTitle, ProgramSession, FormerSession);
    }

    @Override
    public String toString() {
        return "{" +
            " SessionId='" + getSessionId() + "'" +
            ", SessionTitle='" + getSessionTitle() + "'" +
            ", ProgramSession='" + getProgramSession() + "'" +
            ", FormerSession='" + getFormerSession() + "'" +
            "}";
    }

  

}
