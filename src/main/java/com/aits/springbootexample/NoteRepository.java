package com.aits.springbootexample;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface NoteRepository extends MongoRepository<Note, String> {

    public Note findByTitle(String title);
    public Optional<Note> findById(String id);
}