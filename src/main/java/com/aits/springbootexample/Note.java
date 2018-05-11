package com.aits.springbootexample;

import org.springframework.data.annotation.Id;

public class Note {
    @Id
    public String id;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String title;

    public Note(String title, String context) {
        this.title = title;
        this.context = context;
    }

    public String context;
}
