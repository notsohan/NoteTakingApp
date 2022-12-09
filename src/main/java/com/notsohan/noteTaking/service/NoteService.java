package com.notsohan.noteTaking.service;

import com.notsohan.noteTaking.model.NoteRepository;
import com.notsohan.noteTaking.model.NoteTaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteService {
    private final NoteRepository noteRepository;

    @Autowired
    public NoteService(NoteRepository noteRepository){
        this.noteRepository = noteRepository;
    }
    public NoteTaker saveNote(NoteTaker note) {
        return noteRepository.save(note);
    }

    public NoteTaker getNote(Long id) {
        return noteRepository.findById(id).get();
    }

    public List<NoteTaker> getNotes() {
        return noteRepository.findAll();
    }
}
