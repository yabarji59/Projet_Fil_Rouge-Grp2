package com.simplon.formation.persistance.entities;

import javax.persistence.OneToOne;
import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="former")
public class FormerDo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="former_id")
    private Long formerId;

    @Column(name="former_name")
    private String formerName;

    @Column(name="former_lastname")
    private String formerLastname; 

    @OneToOne(mappedBy ="SessionFormer")
    private SessionDo Session;
    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        return "{" +
            " formerId='" + getFormerId() + "'" +
            ", formerName='" + getFormerName() + "'" +
            ", formerLastname='" + getFormerLastname() + "'" +
            "}";
    }

    
    /** 
     * @param o
     * @return boolean
     */
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof FormerDo)) {
            return false;
        }
        FormerDo formerDo = (FormerDo) o;
        return Objects.equals(formerId, formerDo.formerId) && Objects.equals(formerName, formerDo.formerName) && Objects.equals(formerLastname, formerDo.formerLastname);
    }

    
    /** 
     * @return int
     */
    @Override
    public int hashCode() {
        return Objects.hash(formerId, formerName, formerLastname);
    }

    
    /** 
     * @return Long
     */
    public Long getFormerId() {
        return this.formerId;
    }

    
    /** 
     * @param formerId
     */
    public void setFormerId(Long formerId) {
        this.formerId = formerId;
    }

    
    /** 
     * @return String
     */
    public String getFormerName() {
        return this.formerName;
    }

    
    /** 
     * @param formerName
     */
    public void setFormerName(String formerName) {
        this.formerName = formerName;
    }

    
    /** 
     * @return String
     */
    public String getFormerLastname() {
        return this.formerLastname;
    }

    
    /** 
     * @param formerLastname
     */
    public void setFormerLastname(String formerLastname) {
        this.formerLastname = formerLastname;
    }

    public FormerDo(Long formerId, String formerName, String formerLastname) {
        this.formerId = formerId;
        this.formerName = formerName;
        this.formerLastname = formerLastname;
    }

    public FormerDo() {
    }

    public SessionDo getSession() {
        return this.Session;
    }

    public void setSession(SessionDo Session) {
        this.Session = Session;
    }

}

    

   