package com.noob.post.entity;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.time.Instant;
import java.util.Objects;

public class Comment {

    private String id;

    private String comment;

    @DBRef
    private Post post;

    @CreatedDate
    private Instant createdAt;

    @CreatedBy
    private Instant createdBy;

    @LastModifiedDate
    private Instant lastModifiedAt;

    @LastModifiedBy
    private Instant getLastModifiedBy;

    public Comment() {
    }

    public Comment(String id, String comment, Post post, Instant createdAt, Instant createdBy, Instant lastModifiedAt, Instant getLastModifiedBy) {
        this.id = id;
        this.comment = comment;
        this.post = post;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.lastModifiedAt = lastModifiedAt;
        this.getLastModifiedBy = getLastModifiedBy;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public Instant getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Instant createdBy) {
        this.createdBy = createdBy;
    }

    public Instant getLastModifiedAt() {
        return lastModifiedAt;
    }

    public void setLastModifiedAt(Instant lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
    }

    public Instant getGetLastModifiedBy() {
        return getLastModifiedBy;
    }

    public void setGetLastModifiedBy(Instant getLastModifiedBy) {
        this.getLastModifiedBy = getLastModifiedBy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Comment comment = (Comment) o;
        return id.equals(comment.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
