package com.notsohan.noteTaking.service;

import com.notsohan.noteTaking.model.NoteRepository;
import com.notsohan.noteTaking.model.NoteTaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

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

    public NoteTaker updateNote(Long id, NoteTaker note) {
        NoteTaker nt = noteRepository.findById(id).get();

        if(Objects.nonNull(note.getTitle()) &&
                !"".equalsIgnoreCase(note.getTitle())){
            nt.setTitle(note.getTitle());
        }
        if(Objects.nonNull(note.getNote()) &&
                !"".equalsIgnoreCase(note.getNote())){
            nt.setNote(note.getNote());
        }
        return noteRepository.save(nt);
    }

    public void deleteNote(Long uid) {
        noteRepository.deleteById(uid);
    }

    public String getCount() {
        return "The amount of Notes are: "+noteRepository.count();
    }
}
