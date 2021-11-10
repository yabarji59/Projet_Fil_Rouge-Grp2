package com.simplon.formation.presentation.model;

import java.util.Objects;
public class FormerDto {

    private Long formerId;
    private String formerName;
    private String formerLastname;


    public FormerDto() {
    }

    public FormerDto(Long formerId, String formerName, String formerLastname) {
        this.formerId = formerId;
        this.formerName = formerName;
        this.formerLastname = formerLastname;
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

    
    /** 
     * @param o
     * @return boolean
     */
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof FormerDto)) {
            return false;
        }
        FormerDto formerDto = (FormerDto) o;
        return Objects.equals(formerId, formerDto.formerId) && Objects.equals(formerName, formerDto.formerName) && Objects.equals(formerLastname, formerDto.formerLastname);
    }

    
    /** 
     * @return int
     */
    @Override
    public int hashCode() {
        return Objects.hash(formerId, formerName, formerLastname);
    }

    
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

    
}