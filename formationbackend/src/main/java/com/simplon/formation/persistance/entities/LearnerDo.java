package com.simplon.formation.persistance.entities;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="learner")
public class LearnerDo {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="learner_id")
    private long LearnerId;


 
    @ManyToOne(targetEntity = SessionDo.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "learner_id", nullable = false, insertable = false, updatable = false)
    private SessionDo learnerSession;



    public SessionDo getLearnerSession() {
        return this.learnerSession;
    }

    public void setLearnerSession(SessionDo learnerSession) {
        this.learnerSession = learnerSession;
    }

   

    public LearnerDo learnerSession(SessionDo learnerSession) {
        setLearnerSession(learnerSession);
        return this;
    }


    public LearnerDo() {
    }

    public LearnerDo(long LearnerId, SessionDo learnerSession) {
        this.LearnerId = LearnerId;
        this.learnerSession = learnerSession;
    }

    public long getLearnerId() {
        return this.LearnerId;
    }

    public void setLearnerId(long LearnerId) {
        this.LearnerId = LearnerId;
    }

    public LearnerDo LearnerId(long LearnerId) {
        setLearnerId(LearnerId);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof LearnerDo)) {
            return false;
        }
        LearnerDo learnerDo = (LearnerDo) o;
        return LearnerId == learnerDo.LearnerId && Objects.equals(learnerSession, learnerDo.learnerSession);
    }

    @Override
    public int hashCode() {
        return Objects.hash(LearnerId, learnerSession);
    }

    @Override
    public String toString() {
        return "{" +
            " LearnerId='" + getLearnerId() + "'" +
            ", learnerSession='" + getLearnerSession() + "'" +
            "}";
    }
  

    
}
