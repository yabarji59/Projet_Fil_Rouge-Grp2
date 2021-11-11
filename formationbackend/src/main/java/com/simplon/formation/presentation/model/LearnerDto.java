package com.simplon.formation.presentation.model;

/**
 * LearnerDto Object Class
 */
public class LearnerDto {
    private Long learnerId;
    private String learnerName;
    private String learnerFirstname;
    private SessionDto learnerSession;


    public LearnerDto() {
    }

    public LearnerDto(String learnerName, String learnerFirstname) {
        this.learnerName = learnerName;
        this.learnerFirstname = learnerFirstname;
    }

    public LearnerDto(Long learnerId, String learnerName, String learnerFirstname) {
        this.learnerId = learnerId;
        this.learnerName = learnerName;
        this.learnerFirstname = learnerFirstname;
    }

    public LearnerDto(Long learnerId, String learnerName, String learnerFirstname, SessionDto learnersession) {
        this.learnerId = learnerId;
        this.learnerName = learnerName;
        this.learnerFirstname = learnerFirstname;
        this.learnerSession = learnersession;
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

    public SessionDto getLearnerSession() {
        return this.learnerSession;
    }

    public void setLearnerSession(SessionDto session) {
        this.learnerSession = session;
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
