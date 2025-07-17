package com.simple_chat.open_ai_chat.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Agent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private String base_prompt;

//    getters
    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBase_prompt() {
        return base_prompt;
    }

//    setters


    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBase_prompt(String base_prompt) {
        this.base_prompt = base_prompt;
    }
}
