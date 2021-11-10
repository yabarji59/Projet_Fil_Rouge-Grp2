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


    public ProgramDto() {
    }

    public ProgramDto(Long ProgramId, String ProgramTitle, String ProgramDescription) {
        this.ProgramId = ProgramId;
        this.ProgramTitle = ProgramTitle;
        this.ProgramDescription = ProgramDescription;
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

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ProgramDto)) {
            return false;
        }
        ProgramDto programDto = (ProgramDto) o;
        return Objects.equals(ProgramId, programDto.ProgramId) && Objects.equals(ProgramTitle, programDto.ProgramTitle) && Objects.equals(ProgramDescription, programDto.ProgramDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ProgramId, ProgramTitle, ProgramDescription);
    }

    @Override
    public String toString() {
        return "{" +
            " ProgramId='" + getProgramId() + "'" +
            ", ProgramTitle='" + getProgramTitle() + "'" +
            ", ProgramDescription='" + getProgramDescription() + "'" +
            "}";
    }
    
}
