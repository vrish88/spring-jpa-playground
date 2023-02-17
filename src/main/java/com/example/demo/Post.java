package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Post {
    @Id
    private Long id;

    public Post(Long id) {
        this.id = id;
    }

    public Post() {

    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
