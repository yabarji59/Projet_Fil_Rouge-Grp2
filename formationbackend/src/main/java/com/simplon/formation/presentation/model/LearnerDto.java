package com.simplon.formation.presentation.model;

/**
 * LearnerDto Object Class
 */
public class LearnerDto {
    private Long learnerId;
    private String learnerName;
    private String learnerFirstname;
    private SessionDto session;


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

    public LearnerDto(Long learnerId, String learnerName, String learnerFirstname, SessionDto session) {
        this.learnerId = learnerId;
        this.learnerName = learnerName;
        this.learnerFirstname = learnerFirstname;
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

    public String getLearnerFirstname() {
        return this.learnerFirstname;
    }

    public void setLearnerFirstname(String learnerFirstname) {
        this.learnerFirstname = learnerFirstname;
    }

    public SessionDto getSession() {
        return this.session;
    }

    public void setSession(SessionDto session) {
        this.session = session;
    }

    

    @Override
    public String toString() {
        return "{" +
            " learnerId='" + getLearnerId() + "'" +
            ", learnerName='" + getLearnerName() + "'" +
            ", learnerFirstname='" + getLearnerFirstname() + "'" +
            ", session='" + getSession() + "'" +
            "}";
    }


}
