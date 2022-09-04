package com.barbaros.crudnotas.controller;

import com.barbaros.crudnotas.model.Note;

import com.barbaros.crudnotas.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NoteController {

    @Autowired
    private NoteService noteService;

    @GetMapping("/note")
    public List<Note> searchNotes(){
        return noteService.searchNotes();
    }

    @PostMapping("/note")
    public String saveNotes(@RequestBody Note note){
        return noteService.saveNotes(note);
    }

    @DeleteMapping("/note/{id}")
    public String deleteNote(@PathVariable("id") Long id){
        return noteService.deleteNote(id);
    }
}

// S.O.L.I.D. Principios para que el código sea mantenible y tenga buenas practicas
// S: single responsability principle: Cada capa debe cumplir una sola reponsabilidad
// O: open/close principle
// L: Liskov subtitution principle
// I: Interface segregation
// D: dependency invertion