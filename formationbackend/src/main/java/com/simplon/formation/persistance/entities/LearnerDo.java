package com.simplon.formation.persistance.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * LearnerDo model class
 */
@Entity
@Table(name = "learner")
public class LearnerDo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="learner_id")
    private Long learnerId;

    @Column(name="learner_name")
    private String learnerName;

    @Column(name="learner_firstname")
    private String learnerFisrtname;

    @ManyToOne
    private SessionDo session;
    


    public LearnerDo() {
    }

    public LearnerDo(String learnerName, String learnerFisrtname) {
        this.learnerName = learnerName;
        this.learnerFisrtname = learnerFisrtname;
    }

    public LearnerDo(Long learnerId, String learnerName, String learnerFisrtname) {
        this.learnerId = learnerId;
        this.learnerName = learnerName;
        this.learnerFisrtname = learnerFisrtname;
    }

    public LearnerDo(Long learnerId, String learnerName, String learnerFisrtname, SessionDo session) {
        this.learnerId = learnerId;
        this.learnerName = learnerName;
        this.learnerFisrtname = learnerFisrtname;
        this.session = session;
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

    public String getLearnerFisrtname() {
        return this.learnerFisrtname;
    }

    public void setLearnerFisrtname(String learnerFisrtname) {
        this.learnerFisrtname = learnerFisrtname;
    }

    public SessionDo getSession() {
        return this.session;
    }

    public void setSession(SessionDo session) {
        this.session = session;
    }


    @Override
    public String toString() {
        return "{" +
            " learnerId='" + getLearnerId() + "'" +
            ", learnerName='" + getLearnerName() + "'" +
            ", learnerFisrtname='" + getLearnerFisrtname() + "'" +
            ", session='" + getSession() + "'" +
            "}";
    }




}
