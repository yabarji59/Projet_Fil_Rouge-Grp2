package com.simplon.formation.persistance.entities;

import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
/**
 * /**
 * class object sessionDo
 */
 


@Entity 
@Table(name= "session")
public class SessionDo {
     
    @Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="session_id")
	private Long SessionId;
	
	@Column(name="session_title")
	private String SessionTitle;
    
    
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "program_id", nullable = false)
    private ProgramDo SessionProgram;


    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "former_id", nullable = false)
    private FormerDo SessionFormer;


    @OneToMany(mappedBy = "learner", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private List<LearnerDo> learners;

/**simple constr */

    public SessionDo() {
    }

    public SessionDo(Long SessionId, String SessionTitle, ProgramDo SessionProgram, FormerDo SessionFormer, List<LearnerDo> learners) {
        this.SessionId = SessionId;
        this.SessionTitle = SessionTitle;
        this.SessionProgram = SessionProgram;
        this.SessionFormer = SessionFormer;
        this.learners = learners;
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

    public ProgramDo getSessionProgram() {
        return this.SessionProgram;
    }

    public void setSessionProgram(ProgramDo SessionProgram) {
        this.SessionProgram = SessionProgram;
    }

    public FormerDo getSessionFormer() {
        return this.SessionFormer;
    }

    public void setSessionFormer(FormerDo SessionFormer) {
        this.SessionFormer = SessionFormer;
    }

    public List<LearnerDo> getLearners() {
        return this.learners;
    }

    public void setLearners(List<LearnerDo> learners) {
        this.learners = learners;
    }

    public SessionDo SessionId(Long SessionId) {
        setSessionId(SessionId);
        return this;
    }

    public SessionDo SessionTitle(String SessionTitle) {
        setSessionTitle(SessionTitle);
        return this;
    }

    public SessionDo SessionProgram(ProgramDo SessionProgram) {
        setSessionProgram(SessionProgram);
        return this;
    }

    public SessionDo SessionFormer(FormerDo SessionFormer) {
        setSessionFormer(SessionFormer);
        return this;
    }

    public SessionDo learners(List<LearnerDo> learners) {
        setLearners(learners);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof SessionDo)) {
            return false;
        }
        SessionDo sessionDo = (SessionDo) o;
        return Objects.equals(SessionId, sessionDo.SessionId) && Objects.equals(SessionTitle, sessionDo.SessionTitle) && Objects.equals(SessionProgram, sessionDo.SessionProgram) && Objects.equals(SessionFormer, sessionDo.SessionFormer) && Objects.equals(learners, sessionDo.learners);
    }

    @Override
    public int hashCode() {
        return Objects.hash(SessionId, SessionTitle, SessionProgram, SessionFormer, learners);
    }

    @Override
    public String toString() {
        return "{" +
            " SessionId='" + getSessionId() + "'" +
            ", SessionTitle='" + getSessionTitle() + "'" +
            ", SessionProgram='" + getSessionProgram() + "'" +
            ", SessionFormer='" + getSessionFormer() + "'" +
            ", learners='" + getLearners() + "'" +
            "}";
    }



}
