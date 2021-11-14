package com.simplon.formation.presentation.model;

import java.util.Objects;
/**
 * 
program object class
 */
public class ProgramDto {

    private Long ProgramId;
    private String ProgramTitle;
    private String ProgramDescription;
    private SessionDto programSession;



    public ProgramDto() {
    }

    public ProgramDto(Long ProgramId, String ProgramTitle, String ProgramDescription, SessionDto programSession) {
        this.ProgramId = ProgramId;
        this.ProgramTitle = ProgramTitle;
        this.ProgramDescription = ProgramDescription;
        this.programSession = programSession;
    }

    public Long getProgramId() {
        return this.ProgramId;
    }

    public void setProgramId(Long ProgramId) {
        this.ProgramId = ProgramId;
    }

    public String getProgramTitle() {
        return this.ProgramTitle;
    }

    public void setProgramTitle(String ProgramTitle) {
        this.ProgramTitle = ProgramTitle;
    }

    public String getProgramDescription() {
        return this.ProgramDescription;
    }

    public void setProgramDescription(String ProgramDescription) {
        this.ProgramDescription = ProgramDescription;
    }

    public SessionDto getProgramSession() {
        return this.programSession;
    }

    public void setProgramSession(SessionDto programSession) {
        this.programSession = programSession;
    }

    public ProgramDto ProgramId(Long ProgramId) {
        setProgramId(ProgramId);
        return this;
    }

    public ProgramDto ProgramTitle(String ProgramTitle) {
        setProgramTitle(ProgramTitle);
        return this;
    }

    public ProgramDto ProgramDescription(String ProgramDescription) {
        setProgramDescription(ProgramDescription);
        return this;
    }

    public ProgramDto programSession(SessionDto programSession) {
        setProgramSession(programSession);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ProgramDto)) {
            return false;
        }
        ProgramDto programDto = (ProgramDto) o;
        return Objects.equals(ProgramId, programDto.ProgramId) && Objects.equals(ProgramTitle, programDto.ProgramTitle) && Objects.equals(ProgramDescription, programDto.ProgramDescription) && Objects.equals(programSession, programDto.programSession);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ProgramId, ProgramTitle, ProgramDescription, programSession);
    }

    @Override
    public String toString() {
        return "{" +
            " ProgramId='" + getProgramId() + "'" +
            ", ProgramTitle='" + getProgramTitle() + "'" +
            ", ProgramDescription='" + getProgramDescription() + "'" +
            ", programSession='" + getProgramSession() + "'" +
            "}";
    }


}
