package com.simplon.formation.persistance.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
/**
 * class object programDo
 */

@Entity
@Table(name="program")
public class ProgramDo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="program_id")
    private long ProgramId;

    @Column(name = "program_title")
    private String ProgramTitle;
    
    @Column(name = "program_description")
    private String ProgramDescription;


    public ProgramDo() {
    }

    public ProgramDo(long ProgramId, String ProgramTitle, String ProgramDescription) {
        this.ProgramId = ProgramId;
        this.ProgramTitle = ProgramTitle;
        this.ProgramDescription = ProgramDescription;
    }

    public long getProgramId() {
        return this.ProgramId;
    }

    public void setProgramId(long ProgramId) {
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

    public ProgramDo ProgramId(long ProgramId) {
        setProgramId(ProgramId);
        return this;
    }

    public ProgramDo ProgramTitle(String ProgramTitle) {
        setProgramTitle(ProgramTitle);
        return this;
    }

    public ProgramDo ProgramDescription(String ProgramDescription) {
        setProgramDescription(ProgramDescription);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ProgramDo)) {
            return false;
        }
        ProgramDo programDo = (ProgramDo) o;
        return ProgramId == programDo.ProgramId && Objects.equals(ProgramTitle, programDo.ProgramTitle) && Objects.equals(ProgramDescription, programDo.ProgramDescription);
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