package com.noob.uaa.entity;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;

@Document(collection = "roles")
public class Role {

    @Id
    private String id;

    private String name;

    @CreatedDate
    private Instant createdDate;

    public Role() {
    }

    public Role(String id, Instant createdDate) {
        this.id = id;
        this.createdDate = createdDate;
    }

    public Role(String id, String name, Instant createdDate) {
        this.id = id;
        this.name = name;
        this.createdDate = createdDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Instant getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Instant createdDate) {
        this.createdDate = createdDate;
    }
}
