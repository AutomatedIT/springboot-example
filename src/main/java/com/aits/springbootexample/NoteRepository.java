package com.aits.springbootexample;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface NoteRepository extends MongoRepository<Note, String> {

    public Note findByTitle(String title);
}