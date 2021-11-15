package com.simplon.formation.persistance.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * LearnerDo model class
 */
@Entity
@Table(name = "learner")
public class LearnerDo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="learner_id")
    private Long learnerId;

    @Column(name="learner_name")
    private String learnerName;

    @Column(name="learner_firstname")
    private String learnerFirstname;

    @ManyToOne(targetEntity = SessionDo.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "session_id", nullable = true,insertable = true, updatable = true)
    private SessionDo learnerSession;
    


    public LearnerDo() {
    }

    public LearnerDo(String learnerName, String learnerFirstname) {
        this.learnerName = learnerName;
        this.learnerFirstname = learnerFirstname;
    }

    public LearnerDo(Long learnerId, String learnerName, String learnerFirstname) {
        this.learnerId = learnerId;
        this.learnerName = learnerName;
        this.learnerFirstname = learnerFirstname;
    }

    public LearnerDo(Long learnerId, String learnerName, String learnerFirstname, SessionDo learnerSession) {
        this.learnerId = learnerId;
        this.learnerName = learnerName;
        this.learnerFirstname = learnerFirstname;
        this.learnerSession = learnerSession;
    }



    public Long getLearnerId() {
        return this.learnerId;
    }

    public void setLearnerId(Long learnerId) {
        this.learnerId = learnerId;
    }

    public String getLearnerName() {
        return this.learnerName;
    }

    public void setLearnerName(String learnerName) {
        this.learnerName = learnerName;
    }

    public String getLearnerFirstname() {
        return this.learnerFirstname;
    }

    public void setLearnerFirstname(String learnerFirstname) {
        this.learnerFirstname = learnerFirstname;
    }

    public SessionDo getLearnerSession() {
        return this.learnerSession;
    }

    public void setLearnerSession(SessionDo learnerSession) {
        this.learnerSession = learnerSession;
    }


    @Override
    public String toString() {
        return "{" +
            " learnerId='" + getLearnerId() + "'" +
            ", learnerName='" + getLearnerName() + "'" +
            ", learnerFirstname='" + getLearnerFirstname() + "'" +
            ", session='" + getLearnerSession() + "'" +
            "}";
    }




}