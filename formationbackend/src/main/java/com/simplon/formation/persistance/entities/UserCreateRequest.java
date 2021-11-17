package com.simplon.formation.persistance.entities;
import java.util.Objects;

import lombok.Data;

@Data
public class UserCreateRequest {
    private String username;
    private String password;

    public UserCreateRequest() {
    }

    public UserCreateRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserCreateRequest username(String username) {
        setUsername(username);
        return this;
    }

    public UserCreateRequest password(String password) {
        setPassword(password);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof UserCreateRequest)) {
            return false;
        }
        UserCreateRequest userCreateRequest = (UserCreateRequest) o;
        return Objects.equals(username, userCreateRequest.username) && Objects.equals(password, userCreateRequest.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password);
    }

    @Override
    public String toString() {
        return "{" +
            " username='" + getUsername() + "'" +
            ", password='" + getPassword() + "'" +
            "}";
    }

}