package com.notsohan.noteTaking.controller;

import com.notsohan.noteTaking.model.NoteTaker;
import com.notsohan.noteTaking.service.NoteService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1")
public class NoteController {
    private final NoteService noteService;

    @Autowired
    public NoteController(NoteService noteService){
        this.noteService = noteService;
    }

    @PostMapping("view")
    public NoteTaker saveNote(@Valid @RequestBody NoteTaker note){
        return noteService.saveNote(note);
    }

    @GetMapping("view/{id}")
    public NoteTaker getNote(@PathVariable("id") Long id){
        return noteService.getNote(id);
    }

    @GetMapping("view")
    public List<NoteTaker> getNotes(){
        return noteService.getNotes();
    }
    @PutMapping("update/{id}")
    public NoteTaker updateNote(@PathVariable("id") Long id,
                                @RequestBody NoteTaker note){
        return noteService.updateNote(id, note);
    }

    @DeleteMapping("delete/{id}")
    public void deleteNote(@PathVariable("id") Long uid){
        noteService.deleteNote(uid);
    }

    @GetMapping("count")
    public String getCount(){
        return noteService.getCount();
    }
}
