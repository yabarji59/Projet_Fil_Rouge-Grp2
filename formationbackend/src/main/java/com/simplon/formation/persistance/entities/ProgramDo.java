package com.simplon.formation.persistance.entities;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
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


    @OneToOne(mappedBy ="SessionProgram")
    private SessionDo Session;

    public ProgramDo() {
    }
    public ProgramDo(String ProgramTitle, String ProgramDescription, SessionDo Session) {
        this.ProgramTitle = ProgramTitle;
        this.ProgramDescription = ProgramDescription;
        this.Session = Session;
    }

    public ProgramDo(long ProgramId, String ProgramTitle, String ProgramDescription, SessionDo Session) {
        this.ProgramId = ProgramId;
        this.ProgramTitle = ProgramTitle;
        this.ProgramDescription = ProgramDescription;
        this.Session = Session;
    }
    public ProgramDo( String ProgramTitle, String ProgramDescription) {
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

    public SessionDo getSession() {
        return this.Session;
    }

    public void setSession(SessionDo Session) {
        this.Session = Session;
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

    public ProgramDo Session(SessionDo Session) {
        setSession(Session);
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
        return ProgramId == programDo.ProgramId && Objects.equals(ProgramTitle, programDo.ProgramTitle) && Objects.equals(ProgramDescription, programDo.ProgramDescription) && Objects.equals(Session, programDo.Session);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ProgramId, ProgramTitle, ProgramDescription, Session);
    }

    @Override
    public String toString() {
        return "{" +
            " ProgramId='" + getProgramId() + "'" +
            ", ProgramTitle='" + getProgramTitle() + "'" +
            ", ProgramDescription='" + getProgramDescription() + "'" +
            ", Session='" + getSession() + "'" +
            "}";
    }

}