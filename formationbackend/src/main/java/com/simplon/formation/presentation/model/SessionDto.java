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
    private List<LearnerDto> LearnersSession;


    public SessionDto() {
    }

    public SessionDto(Long SessionId, String SessionTitle, ProgramDto ProgramSession, FormerDto FormerSession, List<LearnerDto> LearnersSession) {
        this.SessionId = SessionId;
        this.SessionTitle = SessionTitle;
        this.ProgramSession = ProgramSession;
        this.FormerSession = FormerSession;
        this.LearnersSession = LearnersSession;
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

    public List<LearnerDto> getLearnersSession() {
        return this.LearnersSession;
    }

    public void setLearnersSession(List<LearnerDto> LearnersSession) {
        this.LearnersSession = LearnersSession;
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

    public SessionDto LearnersSession(List<LearnerDto> LearnersSession) {
        setLearnersSession(LearnersSession);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof SessionDto)) {
            return false;
        }
        SessionDto sessionDto = (SessionDto) o;
        return Objects.equals(SessionId, sessionDto.SessionId) && Objects.equals(SessionTitle, sessionDto.SessionTitle) && Objects.equals(ProgramSession, sessionDto.ProgramSession) && Objects.equals(FormerSession, sessionDto.FormerSession) && Objects.equals(LearnersSession, sessionDto.LearnersSession);
    }

    @Override
    public int hashCode() {
        return Objects.hash(SessionId, SessionTitle, ProgramSession, FormerSession, LearnersSession);
    }

    @Override
    public String toString() {
        return "{" +
            " SessionId='" + getSessionId() + "'" +
            ", SessionTitle='" + getSessionTitle() + "'" +
            ", ProgramSession='" + getProgramSession() + "'" +
            ", FormerSession='" + getFormerSession() + "'" +
            ", LearnersSession='" + getLearnersSession() + "'" +
            "}";
    }

}
