package com.simplon.formation.presentation.model;

import java.util.Objects;
public class FormerDto {

    private Long formerId;
    private String formerName;
    private String formerLastname;
    private SessionDto formerSession;

    public FormerDto() {
    }

    public FormerDto(Long formerId, String formerName, String formerLastname, SessionDto formerSession) {
        this.formerId = formerId;
        this.formerName = formerName;
        this.formerLastname = formerLastname;
        this.formerSession = formerSession;
    }

    public Long getFormerId() {
        return this.formerId;
    }

    public void setFormerId(Long formerId) {
        this.formerId = formerId;
    }

    public String getFormerName() {
        return this.formerName;
    }

    public void setFormerName(String formerName) {
        this.formerName = formerName;
    }

    public String getFormerLastname() {
        return this.formerLastname;
    }

    public void setFormerLastname(String formerLastname) {
        this.formerLastname = formerLastname;
    }

    public SessionDto getFormerSession() {
        return this.formerSession;
    }

    public void setFormerSession(SessionDto formerSession) {
        this.formerSession = formerSession;
    }

    public FormerDto formerId(Long formerId) {
        setFormerId(formerId);
        return this;
    }

    public FormerDto formerName(String formerName) {
        setFormerName(formerName);
        return this;
    }

    public FormerDto formerLastname(String formerLastname) {
        setFormerLastname(formerLastname);
        return this;
    }

    public FormerDto formerSession(SessionDto formerSession) {
        setFormerSession(formerSession);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof FormerDto)) {
            return false;
        }
        FormerDto formerDto = (FormerDto) o;
        return Objects.equals(formerId, formerDto.formerId) && Objects.equals(formerName, formerDto.formerName) && Objects.equals(formerLastname, formerDto.formerLastname) && Objects.equals(formerSession, formerDto.formerSession);
    }

    @Override
    public int hashCode() {
        return Objects.hash(formerId, formerName, formerLastname, formerSession);
    }

    @Override
    public String toString() {
        return "{" +
            " formerId='" + getFormerId() + "'" +
            ", formerName='" + getFormerName() + "'" +
            ", formerLastname='" + getFormerLastname() + "'" +
            ", formerSession='" + getFormerSession() + "'" +
            "}";
    }

}